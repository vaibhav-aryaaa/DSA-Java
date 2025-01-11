class Student{
    String name;
    static String school;

    public static void changeSchool(){
        school= "newschool";
    }
}
public class statjc {
    public static void main(String[] args) {
        Student.school="jahs";
        Student s1= new Student();
        s1.name="Amanda";
        System.out.println(s1.school);

    }
    
}
