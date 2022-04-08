import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.Arrays;

public class AssertIterableEqualsTest {

    @Test
    public void testAssertIterableEqualsWithEqualIterables(){
        Iterable<Integer> expectedValues = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Iterable<Integer> actualValues = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertIterableEquals(expectedValues, actualValues);
    }

    @Test
    public void testAssertIterableEqualsWithUnequalIterablesAndMessage(){
        Iterable<Integer> expectedValues = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Iterable<Integer> actualValues = new ArrayList<>(Arrays.asList(1, 2, 3));
        String message = "These iterables are not equal";
        assertIterableEquals(expectedValues, actualValues, message);
    }

    @Test
    public void testAssertIterableEqualsWithUnequalIterablesAndMessageSupplier(){
        Iterable<Integer> expectedValues = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Iterable<Integer> actualValues = new ArrayList<>(Arrays.asList(1, 2, 3));
        Supplier<String> messageSupplier = () -> "These iterables are not equal";
        assertIterableEquals(expectedValues, actualValues, messageSupplier);
    }

}
