package com.jenson.data.patternsduty;

import com.jenson.data.patternsduty.gof.AmericaPersonBuilder;
import com.jenson.data.patternsduty.gof.Director;
import com.jenson.data.patternsduty.gof.KoreaPersonBuilder;
import com.jenson.data.patternsduty.gof.PersonBuilder;
import com.jenson.data.patternsduty.normal.Person;
import com.jenson.data.patternsduty.normal.PersonLombok;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class PatternSdutyApplication {

    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person("bongki",
                "lee",
                "suwonsi",
                32,
                "programmer",
                "kakaopay",
                "pangyo",
                10000000,
                "010-6816-7175");

        Person.Builder builder = new Person.Builder();
        Person person3 = builder.lastname("lee")
                .firstname("bongki")
                .age(32)
                .build();

        log.info("person {}", person);
        log.info("person2 {}", person2);
        log.info("person3 {}", person3);

        PersonLombok.PersonLombokBuilder builder1 = PersonLombok.builder();
        PersonLombok personLombok = builder1.lastName("lee")
                .firstName("bongki")
                .age(31)
                .build();

        log.info("lombok person {}", personLombok);


        //gof
        PersonBuilder personBuilder = new KoreaPersonBuilder();
//        PersonBuilder personBuilder = new AmericaPersonBuilder();
        Director director = new Director(personBuilder);
        director.constructPerson();

        com.jenson.data.patternsduty.gof.Person person5 = director.getPerson();

        log.info("person5 {}", person5);

        SpringApplication.run(PatternSdutyApplication.class, args);
    }

}
