import static org.junit.jupiter.api.Assertions.*;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;


public class StringUtilsAssertNotEqualsTest {

    @Test
    void givenEmptyString_thenEmptyStringIsReturned(){
        String actualValue = StringUtils.reverse("");
        String expectedValue = "1234";
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    void givenNonNullAndNonEmptyString_thenReversedStringIsReturned(){
        String actualValue = StringUtils.reverse("ABCD");
        String expectedValue = "DCBA";
        String message = "assertNotEquals failed";

        assertNotEquals(actualValue, expectedValue, message);
    }

    @Test
    void givenNonNullAndNonEmptyString_thenReversedStringIsReturned2(){
        String actualValue = StringUtils.reverse("1234");
        String expectedValue = "4321";
        Supplier<String> messageSupplier = () -> "assertNotEquals failed";

        assertNotEquals(actualValue, expectedValue, messageSupplier);
    }

}
