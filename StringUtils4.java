import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class StringUtils4{
    public String reverse(String str){
        return new StringBuilder(str).reverse().toString();
  }
    public boolean isPalindrome(String str){
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
  }
    public String toUpperCase(String str){
        return str.toUpperCase();
  }
}
class StringUtilsTest{
    private StringUtils stringUtils;
    @BeforeEach
    void setUp(){
        stringUtils = new StringUtils();
    }
    @Test
    void testReverse(){
        assertEquals("dcba", stringUtils.reverse("abcd"));
    }
    @Test
    void testIsPalindrome(){
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
    }
    @Test
    void testToUpperCase(){
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
  }
}
class ListManager{
    public void addElement(List<Integer> list, int element){
        list.add(element);
  }
    public void removeElement(List<Integer> list, int element){
        list.remove(Integer.valueOf(element));
  }
    public int getSize(List<Integer> list){
        return list.size();
  }
}
class ListManagerTest{
    private ListManager listManager;
    private List<Integer> list;
    @BeforeEach
    void setUp(){
        listManager = new ListManager();
        list = new ArrayList<>();
  }
    @Test
    void testAddElement(){
        listManager.addElement(list, 5);
        assertTrue(list.contains(5));
  }
    @Test
    void testRemoveElement(){
        list.add(5);
        listManager.removeElement(list, 5);
        assertFalse(list.contains(5));
    }
    @Test
    void testGetSize(){
        listManager.addElement(list, 1);
        listManager.addElement(list, 2);
        assertEquals(2, listManager.getSize(list));
  }
}
class Calculator{
    public int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
   }
        return a / b;
 }
}
class CalculatorTest{
    private Calculator calculator;
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
  }
    @Test
    void testDivide(){
        assertEquals(2, calculator.divide(10, 5));
  }
    @Test
    void testDivideByZero(){
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
  }
}
