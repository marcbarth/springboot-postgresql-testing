package com.example.springbootpostgresqltesting;

import com.example.springbootpostgresqltesting.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Testcontainers
@Transactional
public class PersonRepositoryOneTest extends AbstractContainerControl {

    @Test
    void findPersonByFirstnameAndLastnameTest() {
        personRepository.save(new Person("bruce", "banner", LocalDateTime.now()));
        List<Person> persons = personRepository.findPersonByFirstnameAndLastname("bruce", "banner");
        assertThat(persons.size()).isOne();
    }

}