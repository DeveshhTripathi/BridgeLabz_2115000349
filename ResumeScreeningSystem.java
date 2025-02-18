import java.util.*;
abstract class JobRole{
    private String candidateName;
    private int experienceYears;
    public JobRole(String candidateName, int experienceYears){
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
  }
    public String getCandidateName(){ 
	return candidateName;
 }
    public int getExperienceYears(){ 
	return experienceYears; 
}
    public String toString(){
        return getClass().getSimpleName() + " - Candidate: " + candidateName + ", Experience: " + experienceYears + " years";
 }
}
class SoftwareEngineer extends JobRole{
    public SoftwareEngineer(String candidateName, int experienceYears){
        super(candidateName, experienceYears);
 }
}
class DataScientist extends JobRole{
    public DataScientist(String candidateName, int experienceYears){
        super(candidateName, experienceYears);
  }
}
class ProductManager extends JobRole{
    public ProductManager(String candidateName, int experienceYears){
        super(candidateName, experienceYears);
  }
}
class Resume<T extends JobRole>{
    private List<T> resumes = new ArrayList<>();
    public void addResume(T resume){
        resumes.add(resume);
  }
    public List<T> getResumes(){
        return resumes;
  }
}
class ResumeScreeningUtility{
    public static <T extends JobRole> void processResume(T resume){
        System.out.println("Processing Resume: " + resume);
  }
    public static void processAllResumes(List<? extends JobRole> resumes){
        for (JobRole resume : resumes){
            System.out.println("Screening Resume: " + resume);
  }
 }
}
public class ResumeScreeningSystem{
    public static void main(String[] args){
        SoftwareEngineer seResume = new SoftwareEngineer("Rohan", 5);
        DataScientist dsResume = new DataScientist("Smith", 3);
        ProductManager pmResume = new ProductManager("Rahul", 7);
        Resume<SoftwareEngineer> softwareResumes = new Resume<>();
        softwareResumes.addResume(seResume);
        Resume<DataScientist> dataResumes = new Resume<>();
        dataResumes.addResume(dsResume);
        Resume<ProductManager> productResumes = new Resume<>();
        productResumes.addResume(pmResume);
        System.out.println("\nAI Screening Process:");
        ResumeScreeningUtility.processResume(seResume);
        ResumeScreeningUtility.processResume(dsResume);
        ResumeScreeningUtility.processResume(pmResume);
        System.out.println("\nBatch Screening:");
        ResumeScreeningUtility.processAllResumes(softwareResumes.getResumes());
        ResumeScreeningUtility.processAllResumes(dataResumes.getResumes());
        ResumeScreeningUtility.processAllResumes(productResumes.getResumes());
  }
}

