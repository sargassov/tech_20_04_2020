package task_second.refactor_version.inheritances;

import task_second.refactor_version.engine.Engine;
import task_second.refactor_version.abstract_classes.Car;

public class Lorry extends Car {

    public Lorry(Engine engine, String color, String name) {
        super(engine, color, name);
    }
}
