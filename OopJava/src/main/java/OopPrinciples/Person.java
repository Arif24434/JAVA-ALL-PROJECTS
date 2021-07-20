package OopPrinciples;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String dateOfBirth;


    public Person(String firstName, String lastName, int age, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "PersonStudent.PersonLambda: " + firstName + " " + lastName + " " + age +" "+ dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

}




