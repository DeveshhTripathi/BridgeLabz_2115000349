import java.util.*;
class Voting{
    private Map<String, Integer> voteCount = new HashMap<>();
    private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();
    public void castVote(String candidate){
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteCount.get(candidate));
    }
    public void displayVotes(){
        System.out.println("Votes (In Order of Voting):");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
    }
  }
    public void displaySortedResults(){
        TreeMap<String, Integer> sortedVotes = new TreeMap<>(voteCount);
        System.out.println("Votes (Sorted Order):");
        for (Map.Entry<String, Integer> entry : sortedVotes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
    }
  }
    public void displayWinner(){
        String winner = Collections.max(voteCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Winner: " + winner + " with " + voteCount.get(winner) + " votes.");
  }
}
public class VotingSystem{
    public static void main(String[] args){
        Voting system = new Voting();
        system.castVote("Rohan");
        system.castVote("Jeet");
        system.castVote("Rohan");
        system.castVote("Rahul");
        system.castVote("Jeet");
        system.castVote("Rohan");
        system.displayVotes();
        System.out.println();
        system.displaySortedResults();
        System.out.println();
        system.displayWinner();
    }
}
