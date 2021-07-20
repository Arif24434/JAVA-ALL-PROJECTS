package OopPrinciples;

public class MainPersonStudent {

    public static void main(String[] args) {
        Person Dcosta = new Person("Robert", "Dcosta", 39,"12-10-1978");
        System.out.println("PersonStudent.PersonLambda's name: " + Dcosta.getFirstName());
        System.out.println("PersonStudent.PersonLambda's last name: " + Dcosta.getLastName());
        System.out.println("PersonStudent.PersonLambda's Date of Birth: " + Dcosta.getDateOfBirth());

        System.out.println(Dcosta);

        Person Malvina = new Person("Anna", "Malvina", 27,"07-02-1993");
        System.out.println(Malvina);

        System.out.println("==========================================");

        Student Hamid= new Student("Anas","Hamid",22,"17-06-1998",
                "Chemical Engineering","2018");

        System.out.println(Hamid);
        System.out.println("Students's name: " + Hamid.getFirstName());
        System.out.println("PersonStudent.Student's last name: " + Hamid.getLastName());
        System.out.println("PersonStudent.Student's Age: " + Hamid.getAge());
        System.out.println("PersonStudent.Student's Date of Birth: " + Hamid.getDateOfBirth());
        System.out.println("PersonStudent.Student's Faculty: " + Hamid.getStudentsFaculty());
        System.out.println("PersonStudent.Student's Passing Year: " + Hamid.getStudentsPassingYear());


        Student Rose= new Student("Hanna","Rose",19,"11-09-2001",
                "Physics","2020");

        System.out.println(Rose);
        System.out.println("Students's name: " + Rose.getFirstName());
        System.out.println("PersonStudent.Student's last name: " + Rose.getLastName());
        System.out.println("PersonStudent.Student's Age: " + Rose.getAge());
        System.out.println("PersonStudent.Student's Date of Birth: " + Rose.getDateOfBirth());
        System.out.println("PersonStudent.Student's Faculty: " + Rose.getStudentsFaculty());
        System.out.println("PersonStudent.Student's Passing Year: " + Rose.getStudentsPassingYear());


    }


}
