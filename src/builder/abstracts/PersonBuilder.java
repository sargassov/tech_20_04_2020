package builder.abstracts;

import builder.model.Person;

public abstract class PersonBuilder {
    public Person person;

    public void createPerson() {person = new Person();}

    public abstract void setFirstName();
    public abstract void setLastName();
    public abstract void setMiddleName();
    public abstract void setCountry();
    public abstract void setAddress();
    public abstract void setPhone();
    public abstract void setAge();
    public abstract void setGender();

    public Person getPerson(){return person;}
}
