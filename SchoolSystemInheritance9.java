class Person{
    protected String name;
    protected int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
  }

    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
  }
}
class Teacher extends Person{
    private String subject;
    public Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
  }
    public void displayRole(){
        System.out.println("Role: Teacher, Subject: " + subject);
  }
}
class Student extends Person{
    private int grade;
    public Student(String name, int age, int grade){
        super(name, age);
        this.grade = grade;
    }
    public void displayRole(){
        System.out.println("Role: Student, Grade: " + grade);
    }
}
class Staff extends Person{
    private String position;
    public Staff(String name, int age, String position){
        super(name, age);
        this.position = position;
  }
    public void displayRole(){
        System.out.println("Role: Staff, Position: " + position);
  }
}
public class SchoolSystemInheritance9{
    public static void main(String[] args){
        Teacher teacher = new Teacher("Rohan", 35, "Mathematics");
        Student student = new Student("Jeet", 16, 10);
        Staff staff = new Staff("Rahul", 40, "Administrator");
        teacher.displayInfo();
        teacher.displayRole();
        student.displayInfo();
        student.displayRole();
        staff.displayInfo();
        staff.displayRole();
  }
}
