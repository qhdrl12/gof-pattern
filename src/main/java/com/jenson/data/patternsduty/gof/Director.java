package com.jenson.data.patternsduty.gof;

public class Director {
    private PersonBuilder personBuilder;

    public Director(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public Person getPerson() {
        return personBuilder.getPerson();
    }

    public void constructPerson() {
        personBuilder.createNewPerson();
        personBuilder.buildFirstName();
        personBuilder.buildLastName();
        personBuilder.buildAddress();
        personBuilder.buildAge();
    }
}
