package mjeks.athenkosi;

import junit.framework.TestCase;
import org.junit.Test;

public class ObjectIdentityTest extends TestCase {
    ObjectIdentity id = new ObjectIdentity(13,99);

    @Test
    public void testGetX() {
        assertSame(id.getX(), 13);
    }
}