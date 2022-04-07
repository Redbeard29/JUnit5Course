import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;


public class AssertTrueTest {

    @Test
    public void testAssertTrueWithTrueCondition(){
        boolean trueValue = true;
        assertTrue(trueValue);
    }

    @Test
    public void testAssertTrueWithFalseCondition(){
        boolean falseValue = false;
        assertTrue(falseValue);
    }

    @Test
    public void testAssertTrueWithFalseConditionAndMessage(){
        boolean falseValue = false;
        String message = "The actual value is false";
        assertTrue(falseValue, message);
    }

    @Test
    public void testAssertTrueWithFalseConditionAndMessageSupplier(){
        boolean falseValue = false;
        Supplier<String> messageSupplier = () -> "The actual value is false";
        assertTrue(falseValue, messageSupplier);
    }

    @Test
    public void testAssertTrueWithBooleanSupplier(){
        boolean trueValue = true;
        assertTrue(() -> trueValue);
    }

    @Test
    public void testAssertTrueWithBooleanSupplierAndMessage(){
        boolean falseValue = false;
        String message = "The actual value is false";
        assertTrue(() -> falseValue, message);
    }

    @Test
    public void testAssertTrueWithBooleanSupplierAndMessageSupplier(){
        boolean falseValue = false;
        Supplier<String> messageSupplier = () -> "The actual value is false";
        assertTrue(() -> falseValue, messageSupplier);
    }
}
