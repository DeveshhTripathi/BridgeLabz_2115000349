class Course{
    protected String courseName;
    protected int duration;
    public Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }
    public void displayInfo(){
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + " weeks");
  }
}
class OnlineCourse extends Course{
    protected String platform;
    protected boolean isRecorded;
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
   }
}

class PaidOnlineCourse extends OnlineCourse{
    private double fee;
    private double discount;
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount){
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%");
    }
}
public class EducationalInheritance7{
    public static void main(String[] args){
        Course basicCourse = new Course("Java Basics", 4);
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 6, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Full-Stack Development", 10, "Coursera", true, 499.99, 20);
        basicCourse.displayInfo();
        onlineCourse.displayInfo();
        paidCourse.displayInfo();
  }
}
