public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Triangle t1 = new Triangle();
        System.out.println("Triangle t1: " + t1.getSideA() + ", " + t1.getSideB() + ", " + t1.getSideC());

        // r (equilateral)
        Triangle t2 = new Triangle(5.5);
        System.out.println("Triangle t2: " + t2.getSideA() + ", " + t2.getSideB() + ", " + t2.getSideC());

        //  (isosceles: x, x, y)
        Triangle t3 = new Triangle(4.0, 6.0);
        System.out.println("Triangle t3: " + t3.getSideA() + ", " + t3.getSideB() + ", " + t3.getSideC());

        
        Triangle t4 = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Triangle t4: " + t4.getSideA() + ", " + t4.getSideB() + ", " + t4.getSideC());

        
        Triangle t5 = t4.cloneTriangle();
        System.out.println("Triangle t5 (clone of t4): " + t5.getSideA() + ", " + t5.getSideB() + ", " + t5.getSideC());
    }
}
