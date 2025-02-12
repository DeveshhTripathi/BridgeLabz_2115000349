class Student{
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    public Student(int rollNumber, String name, int age, char grade){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
  }
}
class StudentList{
    private Student head;
        public void addStudentAtBeginning(int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }
    public void addStudentAtEnd(int rollNumber, String name, int age, char grade){
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null){
            head = newStudent;
            return;
      }
        Student temp = head;
        while (temp.next != null){
            temp = temp.next;
      }
      temp.next = newStudent;
  }
    public void addStudentAtPosition(int rollNumber, String name, int age, char grade, int position){
        if (position <= 1){
            addStudentAtBeginning(rollNumber, name, age, grade);
            return;
     }
        Student newStudent = new Student(rollNumber, name, age, grade);
        Student temp = head;
        for (int i=1; temp != null && i < position - 1; i++){
            temp = temp.next;
     }
        if (temp==null){
            System.out.println("Position out of bounds.");
            return;
     }
        newStudent.next = temp.next;
        temp.next = newStudent;
  }
    public void deleteStudent(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
    }
        if (head.rollNumber == rollNumber){
            head = head.next;
            return;
      }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber){
            temp = temp.next;
    }
        if (temp.next == null){
            System.out.println("Student not found.");
            return;
     }
        temp.next = temp.next.next;
  }
    public void searchStudent(int rollNumber){
        Student temp = head;
        while (temp != null){
            if(temp.rollNumber == rollNumber){
                System.out.println("Student Found: " + temp.name + " (Roll: " + temp.rollNumber + ")");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }
    public void updateStudentGrade(int rollNumber, char newGrade){
        Student temp = head;
        while (temp != null){
            if (temp.rollNumber == rollNumber){
                temp.grade = newGrade;
                System.out.println("Updated grade for " + temp.name + " to " + newGrade);
                return;
       }
            temp = temp.next;
    }
        System.out.println("Student not found.");
  }
    public void displayStudents(){
        if (head == null){
            System.out.println("No student records available.");
            return;
     }
        Student temp = head;
        while (temp != null){
            System.out.println("Roll No: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
     }
  }
}
public class StudentRecordLL1{
    public static void main(String[] args){
        StudentList studentList = new StudentList();
        studentList.addStudentAtEnd(101, "Rahul", 20, 'A');
        studentList.addStudentAtEnd(102, "Rohan", 21, 'B');
        studentList.addStudentAtBeginning(103, "John", 19, 'C');
        studentList.addStudentAtPosition(104, "Jeet", 22, 'B', 2);
        System.out.println("Initial Student Records:");
        studentList.displayStudents();
        System.out.println("\nSearching for student");
        studentList.searchStudent(102);
        System.out.println("\nUpdating grade for Roll Number 101:");
        studentList.updateStudentGrade(101, 'A');
        studentList.displayStudents();
        System.out.println("\nDeleting student");
        studentList.deleteStudent(103);
        studentList.displayStudents();
    }
}
