package com.jenson.data.patternsduty.gof;

public abstract class PersonBuilder {
    protected Person person;

    public Person getPerson() {
        return person;
    }

    public void createNewPerson() {
        person = new Person();
    }

    public abstract void buildFirstName();
    public abstract void buildLastName();
    public abstract void buildAddress();
    public abstract void buildAge();
    public abstract void buildJob();
    public abstract void buildCompany();
    public abstract void buildCompanyAddress();
    public abstract void buildSalary();
    public abstract void buildPhoneNumber();
}
