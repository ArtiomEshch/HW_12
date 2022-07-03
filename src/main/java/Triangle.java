public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public static double getSquare(Triangle triangle) {
        if (triangle == null) throw new NullPointerException("значение null");
        double a = triangle.a;
        double b = triangle.b;
        double c = triangle.c;
        if (a + b == c || a + c == b || b + c == a) throw new NullPointerException();
        double halfPerimeter = triangle.getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
