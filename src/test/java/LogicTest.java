import junit.framework.TestCase;

public class LogicTest extends TestCase {
    Logic logic = new Logic();

    public void testScitani() {
        int a = 5;
        int b = 6;

        assertEquals(11, logic.scitani(a,b));
    }

    public void testOdcitani() {
        int a = 3;
        int b = 2;

        assertEquals(1, logic.odcitani(a,b));
    }

    public void testNasobeni() {
        int a = 3;
        int b = 2;
        assertEquals(6, logic.nasobeni(a,b));
    }

    public void testDeleni() {
        int a = 2;
        int b = 2;
        assertEquals(1, logic.deleni(a,b));
    }

    public void testMocnina() {
        int a = 3;

        assertEquals(9, logic.mocnina(a));
    }

    public void testFactorial() {
        int a = 5;

        assertEquals(120, logic.factorial(a));
    }
}