import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SqaureTesting {
    @Test
    void ToCalculateTheAreaWhenTheValueOfLineIsFour() {
        MethodForQuadrilaterals Square = new MethodForQuadrilaterals(4, 4);
        int expectedoutcome = 16;
        int actualoutcome = Square.areasqaure();
        assertEquals(expectedoutcome, actualoutcome);
    }
    @Test
    void ToCalculateThePerimeterWhenTheValueOfLineIsFive() {
        MethodForQuadrilaterals Square = new MethodForQuadrilaterals(5, 5);
        int expectedoutcome = 25;
        int actualoutcome = Square.perimetersquare();
        assertEquals(expectedoutcome, actualoutcome);
    }
    @Test
    void ToCalculateThePerimeterWhenTheValueOfLineIsNegative() {
        MethodForQuadrilaterals Square = new MethodForQuadrilaterals(-5, -5);
        int expectedoutcome = 25;
        int actualoutcome = Square.perimetersquare();
        assertEquals(expectedoutcome, actualoutcome);
    }
    @Test
    void ToCalculateTheAreaWhenValuesAreNegative() {
        MethodForQuadrilaterals Square = new MethodForQuadrilaterals(-2, -2);
        int expectedoutcome = 4;
        int actualoutcome = Square.areasqaure();
        assertEquals(expectedoutcome, actualoutcome);
    }
}
