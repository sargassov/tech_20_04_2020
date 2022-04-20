package third_task.inheritances;

import third_task.abstract_classes.Shape;

public class Square extends Shape {
    private int side;

    public Square(String title, int side) {
        super(title);
        this.side = side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }
}
