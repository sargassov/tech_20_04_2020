package task_second.refactor_version.abstract_classes;

import task_second.refactor_version.engine.Engine;

public abstract class Car{
    protected Engine engine;
    protected String color;
    protected String name;

    protected void start() {
        if(engine != null)
            System.out.println("Car starting");
        else System.out.println("We haven't engine!!");
    }

    public void move() {
        if(engine != null)
            System.out.println(this.getClass().getName() + " move");
    }

    public void stop() {
        System.out.println(this.getClass().getName() + " stop");
    }

    public Car(Engine engine, String color, String name) {
        this.engine = engine;
        this.color = color;
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.getClass().getName() + " open");
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
