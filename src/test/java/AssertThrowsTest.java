import static org.junit.jupiter.api.Assertions.assertThrows;
import java.io.IOException;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

public class AssertThrowsTest {

    @Test
    public void testAssertThrows(){
        assertThrows(ArithmeticException.class, () -> Divide.divide(1, 0));
    }

    @Test
    public void testAssertThrowsWithMessage(){
        assertThrows(IOException.class, () -> Divide.divide(1, 0), "Wrong exception type!");
    }

    @Test
    public void testAssertThrowsWithMessageSupplier(){
        Supplier<String> messageSupplier = () -> "Wrong exception type!";
        assertThrows(IOException.class, () -> Divide.divide(1, 0), messageSupplier);
    }
}
