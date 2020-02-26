package mjeks.athenkosi;

import junit.framework.TestCase;
import org.junit.Test;

public class TimeoutTest extends TestCase {
    Timeout tm = new Timeout(50);

    @Test(timeout = 3)
    public void testLoop() throws Exception{
        assertEquals(tm.loop(), 50);
    }
}