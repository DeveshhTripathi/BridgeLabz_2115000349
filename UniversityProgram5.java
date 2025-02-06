import java.util.ArrayList;
class University{
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;
    public University(String name){
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
  }
    public void addDepartment(String deptName){
        departments.add(new Department(deptName));
  }
    public void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }
    public void showDetails(){
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department dept : departments){
            System.out.println("- " + dept.getName());
        }
        System.out.println("Faculties:");
        for (Faculty faculty : faculties){
            System.out.println("- " + faculty.getName());
     }
  }
}
class Department{
    private String name;
    public Department(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Faculty{
    private String name;
    public Faculty(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
public class UniversityProgram5{
    public static void main(String[] args){
        University university = new University("Tech University");
        university.addDepartment("Computer Science");
        university.addDepartment("Physics");
        Faculty faculty1 = new Faculty("Mr Shiva");
        Faculty faculty2 = new Faculty("Mr Rahul");
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        university.showDetails();
    }
}
