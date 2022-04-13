import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("Testing Dependency Injection")
public class DependencyInjectionTest {

    @BeforeAll
    public static void beforeAll(TestInfo testInfo){
        System.out.println("beforeAll() has been executed - here is the related test info:");
        System.out.println("Display name - " + testInfo.getDisplayName());
        System.out.println("Test Class - " + testInfo.getTestClass());
        System.out.println("Test Method - " + testInfo.getTestMethod());
        System.out.println("******************************************");
    }

    public DependencyInjectionTest(TestInfo testInfo){
        System.out.println("The constructor has been executed - here is the related test info:");
        System.out.println("Display name - " + testInfo.getDisplayName());
        System.out.println("Test Class - " + testInfo.getTestClass());
        System.out.println("Test Method - " + testInfo.getTestMethod());
        System.out.println("******************************************");
    }

    @BeforeEach
    public void beforeEach(TestInfo testInfo){
        System.out.println("beforeEach() has been executed - here is the related test info:");
        System.out.println("Display name - " + testInfo.getDisplayName());
        System.out.println("Test Class - " + testInfo.getTestClass());
        System.out.println("Test Method - " + testInfo.getTestMethod());
        System.out.println("******************************************");
    }

    @Test
    @DisplayName("Test One")
    public void testOne(TestInfo testInfo){
        System.out.println("testOne() has been executed - here is the related test info:");
        System.out.println("Display name - " + testInfo.getDisplayName());
        System.out.println("Test Class - " + testInfo.getTestClass());
        System.out.println("Test Method - " + testInfo.getTestMethod());
        System.out.println("******************************************");
    }
}
