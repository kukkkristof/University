package uni.sw.unit.testing.mocking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import uni.sw.unit.testing.Triangle;

public class TriangleMockTest {

    @Test
    @ExtendWith(MockitoExtension.class)
    public void OsoscelesTest()
    {
        Triangle mockTriangle = Mockito.mock(Triangle.class);
        
        when(mockTriangle.isIsosceles()).thenReturn(true);

        assertTrue(mockTriangle.isIsosceles());
    }

    @Test
    @ExtendWith(MockitoExtension.class)
    public void EquilateralTest()
    {
        Triangle mockTriangle = Mockito.mock(Triangle.class);
        
        when(mockTriangle.isEquilateral()).thenReturn(false);

        assertFalse(mockTriangle.isEquilateral());
    }

    @Test
    @ExtendWith(MockitoExtension.class)
    public void RightAngeledTest()
    {
        Triangle mockTriangle = Mockito.mock(Triangle.class);
        
        when(mockTriangle.isRightAngeled()).thenReturn(false);

        assertFalse(mockTriangle.isRightAngeled());
    }

    @Test
    @ExtendWith(MockitoExtension.class)
    public void PerimeterTest()
    {
        Triangle mockTriangle = Mockito.mock(Triangle.class);
        
        when(mockTriangle.getPerimeter()).thenReturn(15);

        assertEquals(mockTriangle.getPerimeter(), 15);
    }

    @Test
    @ExtendWith(MockitoExtension.class)
    public void AreaTest()
    {
        Triangle mockTriangle = Mockito.mock(Triangle.class);
        
        when(mockTriangle.getArea()).thenReturn(32.2);

        assertEquals(mockTriangle.getArea(), 32.2);
    }

}
