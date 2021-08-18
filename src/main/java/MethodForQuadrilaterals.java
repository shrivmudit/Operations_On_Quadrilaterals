public class MethodForQuadrilaterals {

    int Line1angle90, Line2angle90;

    public MethodForQuadrilaterals(int Line1angle90, int Line2angle90) {
        this.Line1angle90 = Line1angle90;
        this.Line2angle90 = Line2angle90;
    }


    public int area() {
        return Line1angle90 * Line2angle90;
    }

    public int perimeter() {
        return 2 * (Line1angle90 + Line2angle90);

    }
    public int perimetersquare() {
        return 4*Line1angle90;
    }

    public int areasqaure() {
        return Line1angle90*Line2angle90;
    }
}