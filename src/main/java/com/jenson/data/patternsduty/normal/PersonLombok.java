package com.jenson.data.patternsduty.normal;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class PersonLombok {
    private String firstName;
    private String lastName;
    private String address;
    private int age;
    private String job;
    private String company;
    private String companyAddress;
    private long salary;
    private String phoneNumber;
}
