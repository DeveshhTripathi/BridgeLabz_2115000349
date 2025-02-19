import java.util.Calendar;
import java.util.*;
class Policy{
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
    public String getPolicyholderName(){
        return policyholderName;
    }
    public Date getExpiryDate(){
        return expiryDate;
  }
    public String toString(){
        return policyNumber + " - " + policyholderName + " (" + coverageType + ") - Expiry: " + expiryDate + " - $" + premiumAmount;
  }
}
class InsurancePolicyManagement{
    private Map<String, Policy> policyMap = new HashMap<>();
    private LinkedHashMap<String, Policy> orderedPolicyMap = new LinkedHashMap<>();
    private TreeMap<Date, Policy> sortedByExpiry = new TreeMap<>();
    public void addPolicy(Policy policy){
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicyMap.put(policy.getPolicyNumber(), policy);
        sortedByExpiry.put(policy.getExpiryDate(), policy);
  }
    public Policy getPolicyByNumber(String policyNumber){
        return policyMap.get(policyNumber);
    }
    public List<Policy> getPoliciesExpiringSoon(){
        List<Policy> expiringPolicies = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = calendar.getTime();
        for (Map.Entry<Date, Policy> entry : sortedByExpiry.entrySet()){
            if (entry.getKey().before(thresholdDate)){
                expiringPolicies.add(entry.getValue());
            }else{
                break;
        }
   }
        return expiringPolicies;
  }
    public List<Policy> getPoliciesByHolder(String policyholderName){
        List<Policy> result = new ArrayList<>();
        for (Policy policy : policyMap.values()){
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)){
                result.add(policy);
     }
  }
        return result;
 }
    public void removeExpiredPolicies(){
        Date currentDate = new Date();
        Iterator<Map.Entry<Date, Policy>> iterator = sortedByExpiry.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Date, Policy> entry = iterator.next();
            if(entry.getKey().before(currentDate)){
              String policyNumber = entry.getValue().getPolicyNumber();
              policyMap.remove(policyNumber);
             orderedPolicyMap.remove(policyNumber);
              iterator.remove();
        }else{
                break;
    }
   }
  }
    public void displayAllPolicies(){
        for (Policy policy : policyMap.values()){
            System.out.println(policy);
    }
  }
}
public class InsurencePolicyManagement2{
    public static void main(String[] args){
        InsurancePolicyManagement system = new InsurancePolicyManagement();
        system.addPolicy(new Policy("P001", "Alice", new GregorianCalendar(2024, Calendar.MARCH, 10).getTime(), "Health", 1000));
        system.addPolicy(new Policy("P002", "Bob", new GregorianCalendar(2024, Calendar.FEBRUARY, 28).getTime(), "Auto", 1500));
        system.addPolicy(new Policy("P003", "Charlie", new GregorianCalendar(2024, Calendar.APRIL, 5).getTime(), "Home", 2000));
        system.addPolicy(new Policy("P004", "Dave", new GregorianCalendar(2023, Calendar.DECEMBER, 25).getTime(), "Health", 1200));
        System.out.println("All Policies:");
        system.displayAllPolicies();
        System.out.println("\nPolicies Expiring Soon:");
        List<Policy> expiringSoon = system.getPoliciesExpiringSoon();
        for (Policy policy : expiringSoon) {
            System.out.println(policy);
      }
        System.out.println("\nPolicies for Bob:");
        List<Policy> bobPolicies = system.getPoliciesByHolder("Bob");
        for (Policy policy : bobPolicies){
            System.out.println(policy);
        }
        System.out.println("\nRemoving expired policies...");
        system.removeExpiredPolicies();
        System.out.println("\nAll Policies After Removal:");
        system.displayAllPolicies();
  }
}
