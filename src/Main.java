public class Main {
    public static void main(String[] args) {

        Figure square1 = new Square(30);
        Figure square2 = new Square(25);
        Figure rectangle1 = new Rectangle(20,30);
        Figure triangle1 = new EquilateralTriangle(44);
        Figure circle1 = new Circle(22);
        Figure circle2 = new Circle(12);
        Figure rectangle2 = new Rectangle(15,55);

        System.out.println(new ComposedFigure(
                        square1,
                        square2,
                        rectangle1,
                        rectangle2,
                        triangle1,
                        circle1,
                        circle2)
        );
    }
}
