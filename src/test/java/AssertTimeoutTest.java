import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import org.junit.jupiter.api.Test;

public class AssertTimeoutTest {

    @Test
    void timeoutNotExceeded(){
        assertTimeout(Duration.ofMinutes(3), () ->{
            System.out.println("Timeout not exceeded");
        });
    }

    @Test
    void timeoutNotExceededWithAssertEquals(){
        String actualResult = assertTimeout(Duration.ofMinutes(3), () -> {
           return "result";
        });
        assertEquals("result", actualResult);
    }

    @Test
    void timeoutNotExceededWithMethod(){
        String actualGreeting = assertTimeout(Duration.ofMinutes(3), () -> {
          return Greeting.greeting();
        });
        assertEquals("Hello, my dude.", actualGreeting);
    }

    @Test
    void timeoutExceeded(){
        assertTimeout(Duration.ofMillis(10), () ->{
            Thread.sleep(100);
        });
    }

}
