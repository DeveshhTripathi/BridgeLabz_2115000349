public class Student5{
    private static String universityName = "GLA University";
    private static int totalStudents = 0;
    private String name;
    private final int rollNumber;
    private char grade;
    public Student5(String name, int rollNumber, char grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
  }

    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }
    public void displayDetails(){
        if (this instanceof Student5){
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
    }
 }
    public static void main(String[] args){
        Student5 s1 = new Student5("Shiva", 101, 'A');
        Student5 s2 = new Student5("Rahul", 102, 'B');
        s1.displayDetails();
        s2.displayDetails();
        Student5.displayTotalStudents();
    }
}
