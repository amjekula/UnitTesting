package mjeks.athenkosi;

import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;


public class DisablingTest extends TestCase {
    ObjectIdentity id = new ObjectIdentity(13,20);

    @Ignore
    @Test
    public void testGetX() {
        assertSame(id.getX(), 13);
    }

}
