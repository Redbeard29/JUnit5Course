import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsNullAndNotNullTest {

    @Test
    void givenNullString_thenNullIsReturned(){
        String actualValue = StringUtils.reverse(null);
        assertNull(actualValue);
    }

    @Test
    void givenEmptyString_thenEmptyStringIsReturned(){
        String actualValue = StringUtils.reverse("");
        assertNotNull(actualValue);
    }

    @Test
    void givenNonNullAndNonEmptyString_thenReversedStringIsReturned(){
        String actualValue = StringUtils.reverse("ABCD");
        assertNotNull(actualValue);
    }
}
