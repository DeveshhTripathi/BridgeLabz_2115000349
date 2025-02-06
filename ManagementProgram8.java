import java.util.ArrayList;
class Student{
    private String name;
    private ArrayList<Course> courses;
    public Student(String name){
        this.name = name;
        this.courses = new ArrayList<>();
}
    public void enrollCourse(Course course){
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
 }
    public String getName(){
        return name;
  }
}
class Professor{
    private String name;
    private ArrayList<Course> courses;
    public Professor(String name){ 
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public void assignCourse(Course course){
        courses.add(course);
        course.setProfessor(this);
        System.out.println("Professor " + name + " assigned to " + course.getCourseName());
  }
    public String getName(){
        return name;
  }
}
class Course{
    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;
    public Course(String courseName){
        this.courseName = courseName;
        this.students = new ArrayList<>();
  }
    public void addStudent(Student student){
        students.add(student);
  }
    public void setProfessor(Professor professor){
        this.professor = professor;
}
    public String getCourseName(){
        return courseName;
  }
}
public class ManagementProgram8{
    public static void main(String[] args){
        Student student1 = new Student("Jeet");
        Student student2 = new Student("Rahul");
        Professor professor = new Professor("Dr. Shiva");
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Computer Science");
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student1.enrollCourse(course2);
        professor.assignCourse(course1);
        professor.assignCourse(course2);
    }
}
