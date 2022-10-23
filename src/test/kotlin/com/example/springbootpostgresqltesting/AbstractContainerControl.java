package com.example.springbootpostgresqltesting;

import com.example.springbootpostgresqltesting.repo.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

abstract class AbstractContainerControl {

    @Autowired
    PersonRepository personRepository;

    @BeforeEach
    public void beforeAll() {
        //just use this if the test are not transactional
        personRepository.deleteAll();
    }
}