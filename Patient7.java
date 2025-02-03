public class Patient7{
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private String name;
    private int age;
    private String ailment;
    private final int patientID;
    public Patient7(String name, int age, String ailment, int patientID){
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
    public static void getTotalPatients(){
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
    public void displayDetails(){
        if (this instanceof Patient7){
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Hospital: " + hospitalName); 
   }
}
    public static void main(String[] args){
        Patient7 p1 = new Patient7("Gian", 25, "Fever", 101);
        Patient7 p2 = new Patient7("Rahul", 30, "Flu", 102);
        p1.displayDetails();
        p2.displayDetails();
        Patient7.getTotalPatients();
    }
}
