import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class SqaureTesting {
    @DisplayName("Area with two positive sides")
    @Test
    void ToCalculateTheAreaWhenTheValueOfLineIsFour() {
        MethodForQuadrilaterals Square = new MethodForQuadrilaterals(4, 4);
        int expectedoutcome = 16;
        int actualoutcome = Square.area();
        assertEquals(expectedoutcome, actualoutcome);
    }
    @DisplayName("Perimeter with two pisitives")
    @Test
    void ToCalculateThePerimeterWhenTheValueOfLineIsFive() {
        MethodForQuadrilaterals Square = new MethodForQuadrilaterals(5, 5);
        int expectedoutcome = 25;
        int actualoutcome = Square.perimeter();
        assertEquals(expectedoutcome, actualoutcome);
    }
    @DisplayName("Perimeter with two negatives")
    @Test
    void ToCalculateThePerimeterWhenTheValueOfLineIsNegative() {
        MethodForQuadrilaterals Square = new MethodForQuadrilaterals(-5, -5);
        int expectedoutcome = 25;
        int actualoutcome = Square.perimeter();
        assertEquals(expectedoutcome, actualoutcome);
    }
    @DisplayName("Area with two negatives")
    @Test
    void ToCalculateTheAreaWhenValuesAreNegative() {
        MethodForQuadrilaterals Square = new MethodForQuadrilaterals(-2, -2);
        int expectedoutcome = 4;
        int actualoutcome = Square.area();
        assertEquals(expectedoutcome, actualoutcome);
    }
}
