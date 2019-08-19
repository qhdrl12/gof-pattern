package com.jenson.data.patternsduty.gof.builder;

public class KoreaPersonBuilder extends PersonBuilder {
    @Override
    public void buildFirstName() {
        person.setFirstName("bongki");
    }

    @Override
    public void buildLastName() {
        person.setLastName("lee");
    }

    @Override
    public void buildAddress() {
        person.setAddress("suwon");
    }

    @Override
    public void buildAge() { }

    @Override
    public void buildJob() { }

    @Override
    public void buildCompany() { }

    @Override
    public void buildCompanyAddress() { }

    @Override
    public void buildSalary() { }

    @Override
    public void buildPhoneNumber() { }
}
