import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Class level display name.")
public class DisplayNameOnMethodsTest {

    @Test
    public void methodWithoutDisplayName(){
        System.out.println("Test method has been executed.");
    }

    @Test
    @DisplayName("Method level display name containing spaces.")
    public void methodWithDisplayNameIncludingSpaces(){
        System.out.println("Test method has been executed.");
    }

    @Test
    @DisplayName("Method level display name containing special characters *(&%*&^_)&*)!#")
    public void methodWithDisplayNameIncludingSpecialChars(){
        System.out.println("Test method has been executed.");
    }

}
