import static org.junit.jupiter.api.Assertions.*;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

public class StringUtilsAssertEqualsTest {

    @Test
    void givenEmptyString_thenEmptyStringIsReturned(){
        String actualValue = StringUtils.reverse("");
        String expectedValue = "";

        assertEquals(actualValue, expectedValue);
    }

    @Test
    void givenNonNullAndNonEmptyString_thenReversedStringIsReturned(){
        String actualValue = StringUtils.reverse("ABCD");
        String expectedValue = "DBCA";
        String message = "assertEquals failed";
        assertEquals(expectedValue, actualValue, message);
    }

    @Test
    void givenNonNullAndNonEmptyString_thenReversedStringIsReturned2(){
        String actualValue = StringUtils.reverse("1234");
        String expectedValue = "2314";
        Supplier<String> messageSupplier = () -> "assertEquals failed";
        assertEquals(expectedValue, actualValue, messageSupplier);
    }
}
