import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class FailAssertionPractice {

    @Test
    public void testMethodNotYetImplemented(){
        fail();
    }

    @Test
    public void testMethodNotYetImplementedWithMessage(){
        fail("@Test method not yet implemented!");
    }

    @Test
    public void testMethodNotYetImplementedWithMessageSupplier(){
        fail(() -> "@Test method not yet implemented!");
    }

    @Test
    public void testMethodNotYetImplementedWithRuntimeException(){
        fail(new RuntimeException("@Test method not yet implemented!"));
    }

    @Test
    public void testMethodNotYetImplementedWithRuntimeExceptionAndMessage(){
        fail("@Test method not yet implemented!", new RuntimeException("Failed explicitly"));
    }

    @Test
    public void testActualExceptionThrown(){
        try {
            methodThatShouldThrowException();
            fail("Exception not thrown!");
        }
        catch(UnsupportedOperationException e){

        }
    }

    private void methodThatShouldThrowException(){
        throw new UnsupportedOperationException();
    }

}
