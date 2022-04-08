import static org.junit.jupiter.api.Assertions.assertSame;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

public class AssertSameTest {

    @Test
    public void testAssertSameWithSameObject(){
        String actualValue = "hello";
        String expectedValue = "hello";
        assertSame(expectedValue, actualValue);
    }

    @Test
    public void testAssertSameWithDifferentObject(){
        String actualValue = "hello";
        String expectedValue = "ello";
        assertSame(expectedValue, actualValue);
    }

    @Test
    public void testAssertSameWithDifferentObjectAndMessage(){
        String actualValue = "hello";
        String expectedValue = "ello";
        String message = "The actual value is not the same as the expected value";
        assertSame(expectedValue, actualValue, message);
    }

    @Test
    public void testAssertSameWithDifferentObjectAndMessageSupplier(){
        String actualValue = "hello";
        String expectedValue = "ello";
        Supplier<String> messageSupplier = () -> "The actual value is not the same as the expected value";
        assertSame(actualValue, expectedValue, messageSupplier);
    }
}
