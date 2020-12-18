import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilTest {
    Util utilityClass;

    @BeforeEach
    void init() { utilityClass = new Util(); }

    @Test
    void testAverage() {
        Assertions.assertEquals(2, utilityClass.calculateAverage(1,2,3));
    }

    @Test
    @DisplayName("No arguments, division by zero.")
    void testAverage2() {
        Assertions.assertThrows(ArithmeticException.class, () -> utilityClass.calculateAverage());
    }

    @Test
    void testJoinString() {
        List<String> listOfStrings = new ArrayList<>(Arrays.asList("Java", "Ahoj"));
        Assertions.assertEquals("Java;Ahoj", utilityClass.joinString(listOfStrings, ';'));
    }

    @Test
    @DisplayName("Empty String input.")
    void testJoinString2() {
        List<String> listOfStrings = new ArrayList<>(Arrays.asList("", ""));
        Assertions.assertEquals(";", utilityClass.joinString(listOfStrings, ';'));
    }
}
