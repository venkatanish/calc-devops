import org.junit.*;
import static org.junit.Assert.*;
public class calculatorTest {
    calculator calc = new calculator();
    @Test
    public void test1()
    {

        int j = calc.factorial(5);
        assertEquals(j, 120);
    }
    @Test
    public void test2()
    {

        int j1 = calc.factorial(3);
        assertEquals(j1, 6);

    }

    @Test
    public void test3()
    {

        double j2 = calc.sqrt(121);
        assertEquals(j2, 11,0);

    }

    @Test
    public void test4()
    {

        double j3 = calc.sqrt(144);
        assertEquals(j3, 12,0);

    }




}