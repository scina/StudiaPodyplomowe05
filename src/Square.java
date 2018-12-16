public class Square extends Rectangle {

    public Square(int height) {
        super(height, height);
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                ", field=" + getField() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}
