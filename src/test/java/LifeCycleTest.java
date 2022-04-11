import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifeCycleTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("LifecycleTest - beforeAll() has been executed.");
    }

    public LifeCycleTest(){
        System.out.println("LifecycleTest - Constructor has been executed.");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("LifecycleTest - beforeEach() has been executed.");
    }

    @Test
    public void testOne(){
        System.out.println("Lifecycle Test - testOne() has been executed.");
    }

    @Test
    public void testTwo(){
        System.out.println("Lifecycle Test - testTwo() has been executed.");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("LifecycleTest - afterEach() has been executed.");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("LifecycleTest - afterAll() has been executed.");
    }

}
