package com.jenson.data.patternsduty.gof.builder.normal;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

//@Builder
@Getter
@ToString
public class PersonLombok {
    private String firstName;
    private String lastName;
    private String address;
    private int age;
    private String job = "developer";
    private String company;
    private String companyAddress;
    private long salary;
    private String phoneNumber;

    @Builder
    public PersonLombok(String firstName, String lastName, int age) {


        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
