import java.util.ArrayList;
class School{
    private String name;
    private ArrayList<Student> students;
    public School(String name){
        this.name = name;
        this.students = new ArrayList<>();
  }
    public void addStudent(Student student){
        students.add(student);
  }
    public void showStudents(){
        System.out.println("School: " + name);
        for (Student student : students){
            student.showCourses();
    }
  }
}
class Student{
    protected String name;
    private ArrayList<Course> courses;
    public Student(String name){
        this.name = name;
        this.courses = new ArrayList<>();
 }
    public void enrollCourse(Course course){
        courses.add(course);
        course.addStudent(this);
 }
    public void showCourses(){
        System.out.println("Student: " + name);
        for (Course course : courses){
            System.out.println("Enrolled in: " + course.getName());
    }
  }
}
class Course{
    private String name;
    private ArrayList<Student> students;
    public Course(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public String getName(){
        return name;
    }
    public void showStudents(){
        System.out.println("Course: " + name);
        for(Student student : students){
            System.out.println("Enrolled student: " + student.name);
    }
  }
}
public class SchoolProgram4{
    public static void main(String[] args){
        School school = new School("Modern school");
        Student student1 = new Student("Rahul");
        Student student2 = new Student("Shiva");        
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        student1.enrollCourse(math);
        student1.enrollCourse(science);
        student2.enrollCourse(math);
        school.addStudent(student1);
        school.addStudent(student2);
        school.showStudents();
        math.showStudents();
        science.showStudents();
  }
}
