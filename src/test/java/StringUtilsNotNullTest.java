import static org.junit.jupiter.api.Assertions.*;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

public class StringUtilsNotNullTest {

    @Test
    void givenNonNullString_thenReversedStringIsReturned(){
        String actualValue = StringUtils.reverse("ABCD");
        assertNotNull(actualValue);
    }

    @Test
    void givenEmptyString_thenEmptyStringIsReturned(){
        String actualValue = StringUtils.reverse("");
        assertNotNull(actualValue);
    }

    @Test
    void givenNullString_thenNullIsReturned(){
        String actualValue = StringUtils.reverse(null);
        String message = "Actual string should not be null !!!";
        assertNotNull(actualValue, message);
    }

    @Test
    void givenNullString_thenNullIsReturnedWithSupplierMessage(){
        String actualValue = StringUtils.reverse(null);
        Supplier<String> messageSupplier = () -> "Actual string should not be null!!!";

        assertNotNull(actualValue, messageSupplier);
    }
}
