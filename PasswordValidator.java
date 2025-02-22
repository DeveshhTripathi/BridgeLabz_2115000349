import java.util.*;
import java.io.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidator {
    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }
        return password.length() >= 8 && 
               password.matches(".*[A-Z].*") && 
               password.matches(".*\\d.*");
    }
}

class PasswordValidatorTest {
    private PasswordValidator validator;

    @BeforeEach
    void setUp() {
        validator = new PasswordValidator();
    }

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("SecurePass1"));
    }

    @Test
    void testInvalidPasswordShort() {
        assertFalse(validator.isValid("Short1"));
    }

    @Test
    void testInvalidPasswordNoUppercase() {
        assertFalse(validator.isValid("weakpassword1"));
    }

    @Test
    void testInvalidPasswordNoDigit() {
        assertFalse(validator.isValid("NoDigitsHere"));
    }

    @Test
    void testInvalidPasswordNull() {
        assertFalse(validator.isValid(null));
    }

    @Test
    void testInvalidPasswordOnlyLowercase() {
        assertFalse(validator.isValid("onlylowercaseletters"));
    }
}
