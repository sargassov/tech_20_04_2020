package task_second.refactor_version.inheritances;

import task_second.refactor_version.engine.Engine;
import task_second.refactor_version.abstract_classes.Car;

public class LightWeightCar extends Car {

    public LightWeightCar(Engine engine, String color, String name) {
        super(engine, color, name);
    }

}
