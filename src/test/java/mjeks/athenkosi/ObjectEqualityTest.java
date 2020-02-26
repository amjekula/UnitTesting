package mjeks.athenkosi;

import junit.framework.TestCase;
import org.junit.Test;

public class ObjectEqualityTest extends TestCase {

    ObjectEquality ob1 = new ObjectEquality(7,3);
    ObjectEquality ob2 = new ObjectEquality(7,3);

    @Test
    public void testObjectEquality() {
        assertEquals(ob1.prod(), ob2.prod());
    }
}