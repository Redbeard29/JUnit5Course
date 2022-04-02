import static org.junit.jupiter.api.Assertions.*;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    void givenNullString_thenNullIsReturned(){
        String actualValue = StringUtils.reverse(null);
        //assertNull without message;
        assertNull(actualValue);
    }

    @Test
    void givenEmptyString_thenEmptyStringIsReturned(){
        String actualValue = StringUtils.reverse("");
        String message = "Actual string should be null!!!";
        //assertNull with message
        assertNull(actualValue, message);
    }

    @Test
    void givenNonNullString_thenReversedStringIsReturned(){
        String actual = StringUtils.reverse("ABCD");
        Supplier<String> messageSupplier = () -> "Actual String should be null!!!";

        //assertNull with MessageSupplier
        assertNull(actual, messageSupplier);
    }


}
