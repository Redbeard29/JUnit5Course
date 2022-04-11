import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Display name with spaces and special characters @#$%#%(^")
public class DisplayNameOnClassTest {

    @Test
    public void test(){
        System.out.println("Test method has been executed.");
    }
}
