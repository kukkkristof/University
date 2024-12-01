package uni.sw.unit.testing.mocking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import uni.sw.unit.testing.Fibo;

public class FibonacciMock {
    
    @Test
    @ExtendWith(MockitoExtension.class)
    public void Test15thElementIterative()
    {
        Fibo fibMock = Mockito.mock(Fibo.class);
        when(fibMock.getFiboNumberIterative(eq(15))).thenReturn(610);

        assertEquals(610, fibMock.getFiboNumberIterative(15));

    }

    @Test
    @ExtendWith(MockitoExtension.class)
    public void Test15thElementRecursive()
    {
        Fibo fibMock = Mockito.mock(Fibo.class);
        when(fibMock.getFiboNumberRecursive(eq(15))).thenReturn(610);

        assertEquals(610, fibMock.getFiboNumberRecursive(15));

    }

    @Test
    @ExtendWith(MockitoExtension.class)
    public void Test20thElementIterative()
    {
        Fibo fibMock = Mockito.mock(Fibo.class);
        when(fibMock.getFiboNumberIterative(eq(20))).thenReturn(6765);

        assertEquals(6765, fibMock.getFiboNumberIterative(20));
    }

    @Test
    @ExtendWith(MockitoExtension.class)
    public void Test20thElementRecursive()
    {
        Fibo fibMock = Mockito.mock(Fibo.class);
        when(fibMock.getFiboNumberRecursive(eq(20))).thenReturn(6765);

        assertEquals(6765, fibMock.getFiboNumberRecursive(20));
    }
}
