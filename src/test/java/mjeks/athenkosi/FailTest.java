package mjeks.athenkosi;

import junit.framework.TestCase;
import org.junit.Test;

public class FailTest extends TestCase {
    Fail id = new Fail(25,17);

    @Test
    public void testGetY(){
            assertSame(id.getY(), 12);
    }
}