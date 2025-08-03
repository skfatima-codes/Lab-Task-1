public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    // Default constructor
    public Triangle() {
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
    }

    //  equilateral triangle
    public Triangle(double side) {
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
    }

    //  isosceles triangle (x, x, y)
    public Triangle(double x, double y) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
    }

    //  arbitrary triangle (x, y, z)(Can be any triangle)
    public Triangle(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
    }

    // Clone constructor: accepts Triangle object and returns new Triangle
    public Triangle cloneTriangle() {
        return new Triangle(this.sideA, this.sideB, this.sideC);
    }

    
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
