import static org.junit.jupiter.api.Assertions.assertNotSame;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

public class AssertNotSameTest {

    @Test
    public void testAssertNotSameWithDifferentObject(){
        String actualValue = "hello";
        String expectedValue = "ello";
        assertNotSame(actualValue, expectedValue);
    }

    @Test
    public void testAssertNotSameWithSameObject(){
        String actualValue = "hello";
        String expectedValue = "hello";
        assertNotSame(expectedValue, actualValue);
    }

    @Test
    public void testAssertNotSameWithSameObjectAndMessage(){
        String actualValue = "hello";
        String expectedValue = "hello";
        String message = "The expected value and the actual value are not the same";
        assertNotSame(actualValue, expectedValue, message);
    }

    @Test
    public void testAssertNotSameWithSameObjectAndMessageSupplier(){
        String actualValue = "hello";
        String expectedValue = "hello";
        Supplier<String> messageSupplier = () -> "The expected value and the actual value are not the same";
        assertNotSame(actualValue, expectedValue, messageSupplier);
    }

}
