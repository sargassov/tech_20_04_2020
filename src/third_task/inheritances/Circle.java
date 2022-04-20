package third_task.inheritances;

import third_task.abstract_classes.Shape;

public class Circle extends Shape {
    private int radius;

    public Circle(String title, int radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return 3.14 * (radius * radius);
    }
}
