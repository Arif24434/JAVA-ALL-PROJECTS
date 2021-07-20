package Enum;

public enum WeekDays {
        MON("Monday", "Poniedziałek"),
        TUE("Tuesday", "Wtorek"),
        WED("Wednesday", "Środa"),
        THU("Thursday", "Czwartek"),
        FRI("Friday", "Piątek"),
        SAT("Saturday", "Sobota"),
        SUN("Sunday", "Niedziela");

        private final String englishName;
        private final String polishName;

        private WeekDays(String englishName, String polishName) {
                this.englishName = englishName;
                this.polishName = polishName;
        }


        public String getEnglishName() {
                return englishName;
        }

        public String getPolishName() {
                return polishName;
        }

        public WeekDays fromPolishNames() throws IllegalAccessException {
                for (WeekDays weekdays : WeekDays.values()) {
                        if (weekdays.polishName.equals(polishName)) {

                          return weekdays;
                        }
                }

                throw new IllegalAccessException("This Name of Day"+polishName
                +"Deosnot exist");
        }

}



