import java.util.Scanner;
class Course{
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";
    Course(String courseName, int duration, double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
}
    void displayCourseDetails(){
        System.out.println("Institute: " + instituteName + "\nCourse Name: " + courseName + "\nDuration: " + duration + " months\nFee: " + fee);
}
    static void updateInstituteName(String newInstituteName){
        instituteName = newInstituteName;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Institute Name: ");
        String newInstituteName = sc.nextLine();
        updateInstituteName(newInstituteName);
        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine();
        System.out.print("Enter Duration (months): ");
        int duration = sc.nextInt();
        System.out.print("Enter Fee: ");
        double fee = sc.nextDouble();
        Course course1 = new Course(courseName, duration, fee);
        course1.displayCourseDetails();
  }
}
