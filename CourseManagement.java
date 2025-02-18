import java.util.*;
abstract class CourseType{
    private String courseName;
    private String department;
    public CourseType(String courseName, String department){
        this.courseName = courseName;
        this.department = department;
  }
    public String getCourseName(){
	 return courseName; 
}
    public String getDepartment(){ 
	return department; 
}
    public String toString(){
        return getClass().getSimpleName() + " - Course: " + courseName + ", Department: " + department;
  }
}
class ExamCourse extends CourseType{
    public ExamCourse(String courseName, String department){
        super(courseName, department);
  }
}
class AssignmentCourse extends CourseType{
    public AssignmentCourse(String courseName, String department){
        super(courseName, department);
 }
}
class ResearchCourse extends CourseType{
    public ResearchCourse(String courseName, String department){
        super(courseName, department);
  }
}
class Course<T extends CourseType>{
    private List<T> courses = new ArrayList<>();
    public void addCourse(T course){
        courses.add(course);
  }
    public List<T> getCourses(){
        return courses;
 }
}
class CourseUtility{
    public static void displayCourses(List<? extends CourseType> courses){
        for(CourseType course : courses){
            System.out.println(course);
    }
 }
}
public class CourseManagement{
    public static void main(String[] args){
        ExamCourse math101 = new ExamCourse("Mathematics 101", "Science");
        AssignmentCourse history202 = new AssignmentCourse("History 202", "Arts");
        ResearchCourse aiResearch = new ResearchCourse("AI Research", "Computer Science");
        Course<ExamCourse> examCourseCatalog = new Course<>();
        examCourseCatalog.addCourse(math101);
        Course<AssignmentCourse> assignmentCourseCatalog = new Course<>();
        assignmentCourseCatalog.addCourse(history202);
        Course<ResearchCourse> researchCourseCatalog = new Course<>();
        researchCourseCatalog.addCourse(aiResearch);
        System.out.println("\nAvailable Courses:");
        CourseUtility.displayCourses(examCourseCatalog.getCourses());
        CourseUtility.displayCourses(assignmentCourseCatalog.getCourses());
        CourseUtility.displayCourses(researchCourseCatalog.getCourses());
  }
}
