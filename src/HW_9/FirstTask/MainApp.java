package HW_9.FirstTask;

public class MainApp {
    public static void main(String[] args) {

        calculateAreaOfGeometricFigures();
    }

    private static void calculateAreaOfGeometricFigures() {
        GeometricFigure myCircle = new Circle(
                new Point(1, 1),
                new Point(3, 3)
        );

        GeometricFigure mySquare = new Square(
                new Point(5, 10),
                new Point(12, 0)
        );

        GeometricFigure myTriangle = new Triangle(
                new Point(-2, 4),
                new Point(10, -5),
                new Point(5, 8));

        GeometricFigure[] geometricFigures = {myCircle, mySquare, myTriangle};

        double areaTotal = 0;
        for (GeometricFigure figure: geometricFigures) {
            areaTotal += figure.getArea();
        }
        System.out.println("Sum of areas = " + areaTotal + "\n");

    }
}
