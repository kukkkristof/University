package uni.sw.unit.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    static Fibo globalFibo;

    @BeforeAll
    public static void InitializeTest()
    {
        globalFibo = new Fibo();
        assertTrue(globalFibo instanceof Fibo, "Initialization of fibo class failed!");
    }

    @Test
    public void Fibo8thElementIterativeTest()
    {
        assertEquals(21, globalFibo.getFiboNumberIterative(8));
    }

    @Test
    public void Fibo8thElementRecursiveTest()
    {
        assertEquals(21, globalFibo.getFiboNumberRecursive(8));
    }

    @Test
    public void Fibo23rdElementIterativeTest()
    {
        assertEquals(28657, globalFibo.getFiboNumberIterative(23));
    }

    @Test
    public void Fibo23rdElementRecursiveTest()
    {
        assertEquals(28657, globalFibo.getFiboNumberRecursive(23));
    }

}
