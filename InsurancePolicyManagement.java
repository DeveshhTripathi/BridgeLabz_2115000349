import java.util.Calendar;
import java.util.*;
class Policy implements Comparable<Policy>{
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;
    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount){
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }
    public String getPolicyNumber(){ 
        return policyNumber;
  }
    public Date getExpiryDate(){
        return expiryDate;
   }
    public String getCoverageType(){
        return coverageType;
    }
    public int compareTo(Policy other){
        return this.expiryDate.compareTo(other.expiryDate);
    }
    public int hashCode(){
        return Objects.hash(policyNumber);
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Policy policy = (Policy) obj;
        return Objects.equals(policyNumber, policy.policyNumber);
    }
    public String toString(){
        return String.format("[%s - %s, Expiry: %s, Type: %s, Premium: %.2f]", 
                             policyNumber, policyholderName, expiryDate, coverageType, premiumAmount);
 }
}
public class InsurancePolicyManagement{
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();
    public void addPolicy(Policy policy){
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }
    public void displayAllPolicies(){
        System.out.println("\nAll Policies:");
        hashSet.forEach(System.out::println);
    }
    public void displayExpiringSoon(){
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date thirtyDaysFromNow = cal.getTime();
        System.out.println("\nPolicies Expiring Within 30 Days:");
        for(Policy policy : treeSet){
            if(!policy.getExpiryDate().after(thirtyDaysFromNow)){
                System.out.println(policy);
      }
   }
 }
    public void displayPoliciesByCoverage(String coverageType){
        System.out.println("\nPolicies with Coverage Type: " + coverageType);
        for(Policy policy : hashSet){
            if(policy.getCoverageType().equalsIgnoreCase(coverageType)){
                System.out.println(policy);
      }
   }
 }
    public void findDuplicatePolicies(){
        Set<String> seen = new HashSet<>();
        System.out.println("\nDuplicate Policies:");
        for(Policy policy : hashSet){
            if(!seen.add(policy.getPolicyNumber())){
                System.out.println(policy);
     }
   }
 }
    public void comparePerformance(){
        int count = 100000;
        Set<Policy> hashSetTest = new HashSet<>();
        Set<Policy> linkedHashSetTest = new LinkedHashSet<>();
        Set<Policy> treeSetTest = new TreeSet<>();
        long start, end;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            hashSetTest.add(new Policy(String.valueOf(i), "Holder" + i, new Date(), "Health", 500));
      }
        end = System.nanoTime();
        System.out.println("\nHashSet Insert Time: " + (end - start) + " ns");
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            linkedHashSetTest.add(new Policy(String.valueOf(i), "Holder" + i, new Date(), "Health", 500));
        }
        end = System.nanoTime();
        System.out.println("LinkedHashSet Insert Time: " + (end - start) + " ns");
        start = System.nanoTime();
        for(int i = 0;i<count; i++){
            treeSetTest.add(new Policy(String.valueOf(i), "Holder" + i, new Date(), "Health", 500));
     }
        end = System.nanoTime();
        System.out.println("TreeSet Insert Time: " + (end - start) + " ns");
  }
    public static void main(String[] args){
        InsurancePolicyManagement system = new InsurancePolicyManagement();
        system.addPolicy(new Policy("P001", "Rohan", new GregorianCalendar(2024, Calendar.MARCH, 10).getTime(), "Health", 1000));
        system.addPolicy(new Policy("P002", "Bob", new GregorianCalendar(2024, Calendar.FEBRUARY, 28).getTime(), "Auto", 1500));
        system.addPolicy(new Policy("P003", "John", new GregorianCalendar(2024, Calendar.APRIL, 5).getTime(), "Home", 2000));
        system.addPolicy(new Policy("P004", "Carry", new GregorianCalendar(2024, Calendar.FEBRUARY, 25).getTime(), "Health", 1200));
        system.addPolicy(new Policy("P002", "Ashish", new GregorianCalendar(2024, Calendar.FEBRUARY, 28).getTime(), "Auto", 1500));
        system.displayAllPolicies();
        system.displayExpiringSoon();
        system.displayPoliciesByCoverage("Health");
        system.findDuplicatePolicies();
        system.comparePerformance();
  }
}
