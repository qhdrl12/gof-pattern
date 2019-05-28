package com.jenson.data.patternsduty.normal;

import lombok.ToString;

@ToString
public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int age;
    private String job;
    private String company;
    private String companyAddress;
    private long salary;
    private String phoneNumber;

    public Person(String firstName, String lastName, String address, int age, String job, String company, String companyAddress, long salary, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.job = job;
        this.company = company;
        this.companyAddress = companyAddress;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
    }

    public  static class Builder {
        private String firstName;
        private String lastName;
        private String address;
        private int age;
        private String job;
        private String company;
        private String companyAddress;
        private long salary;
        private String phoneNumber;

        public Builder firstname(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastname(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder company(String company) {
            this.company = company;
            return this;
        }

        public Builder companyAddress(String companyAddress) {
            this.companyAddress = companyAddress;
            return this;
        }

        public Builder salary(long salary) {
            this.salary = salary;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, address, age, job, company, companyAddress, salary, phoneNumber);
        }

    }
}
