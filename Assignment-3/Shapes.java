class Shapes {

    Shapes() {
        System.out.println("Shape object created");
    }

    Shapes(int r) {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }

    Shapes(int l, int b) {
        System.out.println("Rectangle Area: " + (l * b));
    }

    void area(int side) {
        System.out.println("Square Area: " + (side * side));
    }

    void area(double base, double height) {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}
