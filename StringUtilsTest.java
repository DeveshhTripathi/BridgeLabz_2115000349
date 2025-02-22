import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class StringUtils{
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
