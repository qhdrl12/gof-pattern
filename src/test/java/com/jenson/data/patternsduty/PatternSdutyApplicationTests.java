package com.jenson.data.patternsduty;

import com.jenson.data.patternsduty.gof.builder.normal.Person;
import com.jenson.data.patternsduty.gof.builder.normal.PersonLombok;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
@DisplayName("😱")
public class PatternSdutyApplicationTests {

    private static final String lastName = "lee";
    private static final String firstName = "jenson";
    private static final int salary = 1000;
    private static final String job = "developer";

    private void assertPersonFunction(String heading, Person person) {
        assertAll(heading,
                () -> assertEquals(firstName, person.getFirstName()),
                () -> assertEquals(lastName, person.getLastName()),
                () -> assertEquals(salary, person.getSalary()),
                () -> assertEquals(job, person.getJob())
        );
    }

    @Test
    @DisplayName("╯°□°）╯-젠슨-생성")
    public void generate_jenson_default() {
        Person jenson = new Person(lastName, firstName);

        log.info("result {}", jenson);

        assertPersonFunction("jenson", jenson);
    }

    @Test
    @DisplayName("╯°□°）╯-길동-생성")
    public void generate_gildong_default() {
        Person gildong = new Person("gildong",
                "hong",
                "busan",
                21,
                "student",
                null,
                null,
                0,
                "010-6122-1211");

        log.info("result {}", gildong);

        assertPersonFunction("gildong", gildong);
    }

    @Test
    @DisplayName("╯°□°）╯-젠슨-빌더-사용")
    public void generate_jenson_builder() {
        Person.Builder personBuilder = new Person.Builder();
        Person jenson = personBuilder.firstname(firstName)
                .lastname(lastName)
                .salary(1000)
                .job("developer")
                .build();

        log.info("result {}", jenson);

        assertPersonFunction("jenson-builder", jenson);
    }

    @Test
    @DisplayName("╯°□°）╯-젠슨-롬복-빌더-사용")
    public void generate_jenson_lombok_builder() {
        PersonLombok.PersonLombokBuilder personBuilder = PersonLombok.builder();
        PersonLombok jenson = personBuilder.firstName(firstName)
                .lastName(lastName)
                .build();

        log.info("result {}", jenson);

        assertAll("jenson-lombok-builder",
                () -> assertEquals(firstName, jenson.getFirstName()),
                () -> assertEquals(lastName, jenson.getLastName()),
                () -> assertEquals(0, jenson.getSalary()),
                () -> assertEquals(job, jenson.getJob())
        );    }
}

