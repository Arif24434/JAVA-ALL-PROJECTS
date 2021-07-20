package OopPrinciples;

public class Student {

    private String StudentsFirstName;
    private String StudentsLastName;
    private int StudentsAge;
    private String StudentsDateOfBirth;
    private String StudentsFaculty;
    private String StudentsPassingYear;



    public Student(String StudentsFirstName, String StudentsLastName, int StudentsAge, String StudentsDateOfBirth, String StudentsFaculty, String StudentsPassingYear) {
        this.StudentsFirstName = StudentsFirstName;
        this.StudentsLastName = StudentsLastName;
        this.StudentsAge = StudentsAge;
        this.StudentsDateOfBirth = StudentsDateOfBirth;
        this.StudentsFaculty =StudentsFaculty;
        this.StudentsPassingYear=StudentsPassingYear;
    }

    @Override
    public String toString() {
        return "PersonStudent.Student: " + StudentsFirstName + " " + StudentsLastName + " " + StudentsAge +" "+ StudentsDateOfBirth +" "
                + StudentsFaculty +" "+ StudentsPassingYear; }

    public String getFirstName() {
        return StudentsFirstName;
    }

    public String getLastName() {
        return StudentsLastName;
    }

    public int getAge() {
        return StudentsAge;
    }

    public String getDateOfBirth() {
        return StudentsDateOfBirth;
    }
    public String getStudentsFaculty() {
        return StudentsFaculty;
    }
    public String getStudentsPassingYear() {
        return StudentsPassingYear;
    }


}











