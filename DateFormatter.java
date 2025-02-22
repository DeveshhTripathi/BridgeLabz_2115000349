import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DateFormatter {
    public String formatDate(String inputDate) throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
        return outputFormat.format(inputFormat.parse(inputDate));
    }
}

class DateFormatterTest {
    private DateFormatter dateFormatter;

    @BeforeEach
    void setUp() {
        dateFormatter = new DateFormatter();
    }

    @Test
    void testValidDateFormat() throws ParseException {
        assertEquals("25-12-2023", dateFormatter.formatDate("2023-12-25"));
        assertEquals("01-01-2000", dateFormatter.formatDate("2000-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(ParseException.class, () -> dateFormatter.formatDate("12/25/2023"));
    }
}
