class ShapesMain {
    public static void main(String[] args) {

        Shapes s1 = new Shapes();
        Shapes s2 = new Shapes(5);
        Shapes s3 = new Shapes(4, 6);

        s1.area(3);
        s1.area(5.0, 4.0);
    }
}
