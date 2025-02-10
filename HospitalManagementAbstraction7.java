import java.util.ArrayList;
import java.util.List;
abstract class Patient{
    private String patientId;
    private String name;
    private int age;
    public Patient(String patientId, String name, int age){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
  }
    public abstract double calculateBill();
    public void getPatientDetails(){
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
  }
}
interface MedicalRecord{
    void addRecord(String record);
    void viewRecords();
}
class InPatient extends Patient implements MedicalRecord{
    private double dailyCharge = 2000.0;
    private int daysAdmitted;
    private List<String> medicalRecords;
    public InPatient(String patientId, String name, int age, int daysAdmitted){
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.medicalRecords = new ArrayList<>();
  }
    public double calculateBill(){
        return daysAdmitted * dailyCharge;
  }
    public void addRecord(String record){
        medicalRecords.add(record);
 }
    public void viewRecords(){
        System.out.println("Medical Records for In-Patient: ");
        for(String record : medicalRecords){
            System.out.println(record);
    }
  }
}
class OutPatient extends Patient implements MedicalRecord{
    private double consultationFee = 500.0;
    private List<String> medicalRecords;
    public OutPatient(String patientId, String name, int age){
        super(patientId, name, age);
        this.medicalRecords = new ArrayList<>();
    }
    public double calculateBill(){
        return consultationFee;
    }
    public void addRecord(String record){
        medicalRecords.add(record);
    }
    public void viewRecords(){
        System.out.println("Medical Records for Out-Patient: ");
        for (String record : medicalRecords){
            System.out.println(record);
      }
  }
}
public class HospitalManagementAbstraction7{
    public static void processPatient(Patient patient){
        patient.getPatientDetails();
        System.out.println("Total Bill: " + patient.calculateBill());
  }
    public static void main(String[] args){
        InPatient inPatient = new InPatient("101", "Rohan", 45, 5);
        OutPatient outPatient = new OutPatient("202", "Rahul", 30);
        inPatient.addRecord("Surgery on 10th Feb");
        outPatient.addRecord("General Checkup on 12th Feb");
        processPatient(inPatient);
        processPatient(outPatient);
        inPatient.viewRecords();
        outPatient.viewRecords();
  }
}
