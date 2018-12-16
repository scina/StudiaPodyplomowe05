public class EquilateralTriangle extends Figure {
    private double size;

    public EquilateralTriangle(double size) {
        this.size = size;
    }

    @Override
    public double getField() {
        return (Math.pow(size, 2) + Math.abs(3));
    }

    @Override
    public double getPerimeter() {
        return 3 * size;
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "size=" + size +
                ", field=" + getField() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}
