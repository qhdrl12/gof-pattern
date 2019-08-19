package com.jenson.data.patternsduty;

import com.jenson.data.patternsduty.gof.builder.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@DisplayName("G😱F")
public class GofBuilderTests {

    private PersonBuilder koreaPersonBuilder = new KoreaPersonBuilder();
    private PersonBuilder americaPersonBuilder = new AmericaPersonBuilder();

    private Person constructDirector(PersonBuilder builder) {
        Director director = new Director(builder);
        director.constructPerson();
        return director.getPerson();
    }

    @Test
    @DisplayName("GOF 패턴으로 한국인 생성하기")
    public void generate_gof_korea_person() {
        Person koreaPerson = constructDirector(koreaPersonBuilder);

        log.info("result {}", koreaPerson);

        assertAll("korean",
                () -> assertEquals("bongki", koreaPerson.getFirstName()),
                () -> assertEquals("lee", koreaPerson.getLastName()),
                () -> assertEquals(0, koreaPerson.getSalary()),
                () -> assertEquals("suwon", koreaPerson.getAddress())
        );
    }

    @Test
    @DisplayName("GOF 패턴으로 미국인 생성하기")
    public void generate_gof_america_person() {
        Person americaPerson = constructDirector(americaPersonBuilder);

        log.info("result {}", americaPerson);

        assertAll("american",
                () -> assertEquals("jenson", americaPerson.getFirstName()),
                () -> assertEquals("lee", americaPerson.getLastName()),
                () -> assertEquals(0, americaPerson.getSalary()),
                () -> assertEquals("NewYork", americaPerson.getAddress())
        );
    }
}
