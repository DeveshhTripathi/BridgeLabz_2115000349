import java.lang.annotation.*;  
import java.lang.reflect.Method;
import java.util.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult{}
class ExpensiveComputation{
    private final Map<Integer, Integer> cache = new HashMap<>();
    @CacheResult
    public int computeSquare(int number){
        if(cache.containsKey(number)){
            System.out.println("Returning cached result for: " + number);
            return cache.get(number);
        }
        System.out.println("Computing result for: " + number);
        int result = number * number;
        cache.put(number, result);
        return result;
 }
}
public class CacheSystemAnnotation{
    public static void main(String[] args) throws Exception{
        ExpensiveComputation computation = new ExpensiveComputation();
        System.out.println(computation.computeSquare(2));
        System.out.println(computation.computeSquare(2));
        System.out.println(computation.computeSquare(9));
        System.out.println(computation.computeSquare(9));
  }
}
