package task_second.refactor_version;

import task_second.refactor_version.abstract_classes.Car;
import task_second.refactor_version.engine.Engine;
import task_second.refactor_version.inheritances.LightWeightCar;
import task_second.refactor_version.inheritances.Lorry;

public class Main {
    public static void main(String[] args) {

//        Убрал интерфейсы. Повторяющийся код убрал в абcтрактный класс. Обозначил класс Engine
//        Можно еще поставить lombok и кода будет меньше

        Car car = new LightWeightCar(new Engine(), "red", "Light Weight Car");
        Car car2 = new Lorry(new Engine(), "black", "Lorry");

        System.out.println(car);
        System.out.println(car2);

        car.move();
        car.open();
        car.stop();

        car2.move();
        car2.open();
        car2.stop();
    }

}
