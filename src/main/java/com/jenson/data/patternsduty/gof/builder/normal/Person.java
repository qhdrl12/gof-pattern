package com.jenson.data.patternsduty.gof.builder.normal;

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

    public Person(String firstName, String lastName) {
        this(firstName, lastName, "suwon-si");
    }

    public Person(String firstName, String lastName, String address) {
        this(firstName, lastName, address, 32);
    }

    public Person(String firstName, String lastName, String address, int age) {
        this(firstName, lastName, address, age, "developer");
    }

    public Person(String firstName, String lastName, String address, int age, String job) {
        this(firstName, lastName, address, age, job, "kakaopay");
    }

    public Person(String firstName, String lastName, String address, int age, String job, String company) {
        this(firstName, lastName, address, age, job, company, "pangyo");
    }

    public Person(String firstName, String lastName, String address, int age, String job, String company, String companyAddress) {
        this(firstName, lastName, address, age, job, company, companyAddress, 1000);
    }

    public Person(String firstName, String lastName, String address, int age, String job, String company, String companyAddress, long salary) {
        this(firstName, lastName, address, age, job, company, companyAddress, salary, "0");
    }

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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public String getCompany() {
        return company;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public long getSalary() {
        return salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.age = builder.age;
        this.job = builder.job;
        this.company = builder.company;
        this.companyAddress = builder.companyAddress;
        this.salary = builder.salary;
        this.phoneNumber = builder.phoneNumber;
    }

    public static class Builder {
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
//            return new Person(firstName, lastName, address, age, job, company, companyAddress, salary, phoneNumber);
            return new Person(this);
        }

    }
}
