import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    void givenEvenNumber_trueIsReturned(){
        OddEven oddEven = new OddEven();
        assertTrue(oddEven.isNumberEven(10));
    }

    @Test
    void givenOddNumber_falseIsReturned(){
        OddEven oddEven = new OddEven();
        assertFalse(oddEven.isNumberEven(11));
    }


}
