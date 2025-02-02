import java.util.Scanner;
class Student{
    public int rollNumber;
    protected String name;
    private double CGPA;
    Student(int rollNumber, String name, double CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
}
    public double getCGPA(){
        return CGPA;
}
    public void setCGPA(double CGPA){
        this.CGPA = CGPA;
}
    public void displayStudentDetails(){
        System.out.println("Roll Number: " + rollNumber + "\nName: " + name + "\nCGPA: " + CGPA);
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        double CGPA = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();
        PostgraduateStudent pgStudent = new PostgraduateStudent(rollNumber, name, CGPA, specialization);
        pgStudent.displayPostgraduateDetails();
}
}
class PostgraduateStudent extends Student{
    String specialization;
    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization){
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
}
    public void displayPostgraduateDetails(){
        displayStudentDetails();
        System.out.println("Specialization: " + specialization);
    }
}

