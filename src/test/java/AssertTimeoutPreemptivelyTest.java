import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import java.time.Duration;
import org.junit.jupiter.api.Test;

public class AssertTimeoutPreemptivelyTest {

    @Test
    void timeoutExceededWithPreemptiveTermination(){
        assertTimeoutPreemptively(Duration.ofMillis(10), () -> {
            Thread.sleep(100);
        });
    }

}
