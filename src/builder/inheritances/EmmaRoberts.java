package builder.inheritances;

import builder.abstracts.PersonBuilder;

public class EmmaRoberts extends PersonBuilder {
    private static EmmaRoberts instance;

    public static EmmaRoberts getInstance() {
        if(instance != null)
            instance = new EmmaRoberts();
        return instance;
    }

    @Override
    public void setFirstName() {
        person.setFirstName("Emma");
    }

    @Override
    public void setLastName() {
        person.setLastName("Roberts");
    }

    @Override
    public void setMiddleName() {
        person.setMiddleName("Lea");
    }

    @Override
    public void setCountry() {
        person.setCountry("England");
    }

    @Override
    public void setAddress() {
        person.setAddress("London");
    }

    @Override
    public void setPhone() {
        person.setPhone("+66-987654321");
    }

    @Override
    public void setAge() {
        person.setAge(56);
    }

    @Override
    public void setGender() {
        person.setGender("Female");
    }
}
