package third_task.abstract_classes;

public abstract class Shape {
    protected String title;
    public abstract double getSquare();

    public Shape(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
