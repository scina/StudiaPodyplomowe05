public class ComposedFigure extends Figure {

    private Figure[] figures;

    public ComposedFigure(int size) {
        figures = new Figure[size];
    }

    public ComposedFigure(Figure ...figure) {
        figures = figure;
    }

    @Override
    public double getField() {
        double fieldSum = 0;
        for (Figure figure: figures) {
            fieldSum+=figure.getField();
        }
        return fieldSum;
    }

    @Override
    public double getPerimeter() {
        double perimeterSum = 0;
        for (Figure figure: figures) {
            perimeterSum+=figure.getPerimeter();
        }
        return perimeterSum;
    }

    @Override
    public String toString() {
        String s = "ComposedFigure{\n";
        for(Figure figure : figures) {
            s = s + figure.toString() + "\n";
        }
        s = s + "fieldSum=" + getField() + "\n" +
                "perimeterSum=" + getPerimeter() + "\n" +
                '}';
        return s;
    }
}
