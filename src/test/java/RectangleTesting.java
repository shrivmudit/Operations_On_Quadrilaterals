import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTesting {
    @Test
    void ToCalculateTheAreaWhenValuesAreTwoandFour() {
        MethodForQuadrilaterals Rectangle = new MethodForQuadrilaterals(2, 4);
        int expectedoutcome = 8;
        int actualoutcome = Rectangle.area();
        assertEquals(expectedoutcome, actualoutcome);
    }
    @Test
    void ToCalculateThePerimeterWhenValuesTwoandFour() {
        MethodForQuadrilaterals Rectangle = new MethodForQuadrilaterals(2, 4);
        int expectedoutcome = 12;
        int actualoutcome = Rectangle.perimeter();
        assertEquals(expectedoutcome, actualoutcome);
    }
    @Test
    void ToCalculateThePerimeterWhenValuesAreNegative() {
        MethodForQuadrilaterals Rectangle = new MethodForQuadrilaterals(-2, -4);
        int expectedoutcome = -12;
        int actualoutcome = Rectangle.perimeter();
        assertEquals(expectedoutcome, actualoutcome);
    }
    @Test
    void ToCalculateThePerimeterWhenOneValueIsNegative() {
        MethodForQuadrilaterals Rectangle = new MethodForQuadrilaterals(-2, 6);
        int expectedoutcome = 8;
        int actualoutcome = Rectangle.perimeter();
        assertEquals(expectedoutcome, actualoutcome);
    }
}
