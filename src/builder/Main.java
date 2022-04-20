package builder;

// Создать builder для класса Person со следующими полями: String firstName, String lastName,
//         String middleName, String country, String address, String phone, int age, String gender.


import builder.controllers.PersonController;
import builder.inheritances.EmmaRoberts;
import builder.inheritances.JackMichael;
import builder.model.Person;

public class Main {
    public static void main(String[] args) {
        PersonController controller = new PersonController();

        controller.setBuilder(new EmmaRoberts());
        Person emma = controller.getPerson();
        System.out.println(emma);

        controller.setBuilder(new JackMichael());
        Person jack = controller.getPerson();
        System.out.println(jack);
    }
}
