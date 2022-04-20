package builder.controllers;

import builder.abstracts.PersonBuilder;
import builder.model.Person;

public class PersonController {
    private PersonBuilder builder;

    public void setBuilder(PersonBuilder builder) {
        this.builder = builder;
    }

    public Person getPerson(){
        builder.createPerson();
        builder.setAddress();
        builder.setAge();
        builder.setCountry();
        builder.setFirstName();
        builder.setLastName();
        builder.setGender();
        builder.setMiddleName();
        builder.setPhone();
        return builder.getPerson();
    }
}
