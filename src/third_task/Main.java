package third_task;

import third_task.abstract_classes.Shape;
import third_task.inheritances.Circle;
import third_task.inheritances.Square;
import third_task.inheritances.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
//    Написать пример кода, который реализует принципы наследования и полиморфизма, на примере
//    фигур — круг, квадрат, треугольник.
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>(List.of(
                new Square("Квадрат", 5),
                new Circle("Круг", 5),
                new Triangle("Треугольник", 5, 2)
        ));

        //найдем площадь всех фигур

        for(Shape s : shapes){
            System.out.println("Площадь фигуры " + s.getTitle() + " равна " + s.getSquare());
        }



    }
}
