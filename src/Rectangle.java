public class Rectangle extends Figure {
    protected double height;
    protected double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getField() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (2 * height) + (2 * width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", field=" + getField() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}
