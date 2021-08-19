public class MethodForQuadrilaterals {

    int Length, Breath;

    public MethodForQuadrilaterals(int Length, int Breath) {
        this.Length = Length;
        this.Breath = Breath;
    }


    public int area() {
        if(Length==Breath)
        return Length * Length;
        else
            return Length * Breath;
    }

    public int perimeter() {
        if(Length==Breath)
            return 4*Length;
        else
            return 2*(Length+Breath);
    }



}