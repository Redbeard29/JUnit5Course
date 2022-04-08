import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;


public class AssertArrayEqualsTest {

    @Test
    public void testAssertArrayEqualsWithEqualArrays(){
        int[] actualValues = {1, 2, 3, 4};
        int[] expectedValues = {1, 2, 3, 4};
        assertArrayEquals(actualValues, expectedValues);
    }

    @Test
    public void testAssertArrayEqualsWithUnequalArraysWithMessage(){
        int[] actualValues = {1, 2, 3, 4};
        int[] expectedValues = {1, 2, 3};
        String message = "These arrays are not equal";
        assertArrayEquals(actualValues, expectedValues, message);
    }

    @Test
    public void testAssertArrayEqualsWithUnequalArraysWithMessageSupplier(){
        int[] actualValues = {1, 2, 3, 4};
        int[] expectedValues = {1, 2, 3};
        Supplier<String> messageSupplier = () -> "These arrays are not equal";
        assertArrayEquals(actualValues, expectedValues, messageSupplier);
    }

}
