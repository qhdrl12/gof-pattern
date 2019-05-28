package com.jenson.data.patternsduty.gof;

public class AmericaPersonBuilder extends PersonBuilder {
    @Override
    public void buildFirstName() {
        person.setFirstName("jenson");
    }

    @Override
    public void buildLastName() {
        person.setLastName("lee");
    }

    @Override
    public void buildAddress() {
        person.setAddress("NewYork");
    }

    @Override
    public void buildAge() {

    }

    @Override
    public void buildJob() {

    }

    @Override
    public void buildCompany() {

    }

    @Override
    public void buildCompanyAddress() {

    }

    @Override
    public void buildSalary() {

    }

    @Override
    public void buildPhoneNumber() {

    }
}
