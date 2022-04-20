package third_task.inheritances;

import third_task.abstract_classes.Shape;

public class Triangle extends Shape {
    private int side;
    private int height;

    public Triangle(String title, int side, int height) {
        super(title);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return side * height / 2;
    }
}
