import org.junit.*;
import static org.junit.Assert.*;
public class calculatorTest {

    @Test
    public void test1()
    {
        calculator calc = new calculator();
        int j = calc.factorial(5);
        assertEquals(j, 120);
    }
    @Test
    public void test2()
    {
        calculator calc = new calculator();
        int j = calc.factorial(3);
        assertEquals(j, 6);

    }

  /*  @Test
    public void test3()
    {
        calculator calc = new calculator();
        int j = calc.sqrt(121);
        assertEquals(j, 12);

    }

    @Test
    public void test4()
    {
        calculator calc = new calculator();
        int j = calc.sqrt(121);
        assertEquals(j, 11);

    }

*/


}