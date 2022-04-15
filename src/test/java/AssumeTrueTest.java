import static org.junit.jupiter.api.Assumptions.assumeTrue;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

public class AssumeTrueTest {

    @Test
    void testOnDevEnvironment(){
        System.setProperty("ENV", "DEV");
        assumeTrue("DEV".equals(System.getProperty("ENV")));
    }

    @Test
    void testOnProductionEnvironment(){
        System.setProperty("ENV", "PROD");
        String message = "Assumption failed - these tests will not run.";
        assumeTrue("DEV".equals(System.getProperty("ENV")), message);
    }

    @Test
    void testOnSupportEnvironment(){
        System.setProperty("ENV", "SUPP");
        Supplier<String> messageSupplier = () -> "Assumption failed - these tests will not run.";
        assumeTrue("DEV".equals(System.getProperty("ENV")), messageSupplier);
    }

}
