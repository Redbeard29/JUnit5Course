import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

public class AssertFalseTest {

    @Test
    public void testAssertFalseWithFalseCondition(){
        boolean falseValue = false;
        assertFalse(falseValue);
    }

    @Test
    public void testAssertFalseWithTrueCondition(){
        boolean trueValue = true;
        assertFalse(trueValue);
    }

    @Test
    public void testAssertFalseWithTrueConditionAndMessage(){
        boolean trueValue = true;
        String message = "The actual value is true";
        assertFalse(trueValue, message);
    }

    @Test
    public void testAssertFalseWithTrueConditionAndMessageSupplier(){
        boolean trueValue = true;
        Supplier<String> messageSupplier = () -> "The actual value is true";
        assertFalse(trueValue, messageSupplier);
    }

    @Test
    public void testAssertFalseWithBooleanSupplier(){
        boolean falseValue = false;
        assertFalse(() -> falseValue);
    }

    @Test
    public void testAssertFalseWithBooleanSupplierAndMessage(){
        boolean trueValue = true;
        String message = "The actual value is true";
        assertFalse(() -> trueValue, message);
    }

    @Test
    public void testAssertFalseWithBooleanSupplierAndMessageSupplier(){
        boolean trueValue = true;
        Supplier<String> messageSupplier = () -> "The actual value is true";
        assertFalse(() -> trueValue, messageSupplier);
    }

}
