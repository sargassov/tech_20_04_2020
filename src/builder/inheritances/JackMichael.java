package builder.inheritances;

import builder.abstracts.PersonBuilder;

public class JackMichael extends PersonBuilder {
    private static JackMichael instance;

    public static JackMichael getInstance() {
        if(instance != null)
            instance = new JackMichael();
        return instance;
    }
    @Override
    public void setFirstName() {
        person.setFirstName("Jack");
    }

    @Override
    public void setLastName() {
        person.setLastName("Michael");
    }

    @Override
    public void setMiddleName() {
        person.setMiddleName("Rudolf");
    }

    @Override
    public void setCountry() {
        person.setCountry("USA");
    }

    @Override
    public void setAddress() {
        person.setAddress("New York");
    }

    @Override
    public void setPhone() {
        person.setPhone("+1-900-123456789");
    }

    @Override
    public void setAge() {
        person.setAge(28);
    }

    @Override
    public void setGender() {
        person.setGender("Male");
    }
}
