import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTesting {
    @DisplayName("Area with two positive sides")
    @Test
    void ToCalculateTheAreaWhenValuesAreTwoandFour() {
        MethodForQuadrilaterals Rectangle = new MethodForQuadrilaterals(2, 4);
        int expectedoutcome = 8;
        int actualoutcome = Rectangle.area();
        assertEquals(expectedoutcome, actualoutcome);
    }
    @DisplayName("Perimeter with two positive sides")
    @Test
    void ToCalculateThePerimeterWhenValuesTwoandFour() {
        MethodForQuadrilaterals Rectangle = new MethodForQuadrilaterals(2, 4);
        int expectedoutcome = 12;
        int actualoutcome = Rectangle.perimeter();
        assertEquals(expectedoutcome, actualoutcome);
    }
    @DisplayName("Perimeter with two negative sides")
    @Test
    void ToCalculateThePerimeterWhenValuesAreNegative() {
        MethodForQuadrilaterals Rectangle = new MethodForQuadrilaterals(-2, -4);
        int expectedoutcome = -12;
        int actualoutcome = Rectangle.perimeter();
        assertEquals(expectedoutcome, actualoutcome);
    }
    @DisplayName("perimeter with both")
    @Test
    void ToCalculateThePerimeterWhenOneValueIsNegative() {
        MethodForQuadrilaterals Rectangle = new MethodForQuadrilaterals(-2, 6);
        int expectedoutcome = 8;
        int actualoutcome = Rectangle.perimeter();
        assertEquals(expectedoutcome, actualoutcome);
    }
}
