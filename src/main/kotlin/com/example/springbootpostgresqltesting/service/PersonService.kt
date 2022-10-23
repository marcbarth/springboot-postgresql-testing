package com.example.springbootpostgresqltesting.service

import com.example.springbootpostgresqltesting.model.Person
import com.example.springbootpostgresqltesting.repo.PersonRepository
import org.springframework.stereotype.Component

@Component
class PersonService(private val personRepository: PersonRepository) {

    fun findPerson(id:Long): Person? = personRepository.findById(id).orElse(null)

    fun findAllPersons(): List<Person?> = personRepository.findAll()

    fun findPersonByName(firstname: String, lastname: String): List<Person?> = personRepository.findPersonByFirstnameAndLastname(firstname,lastname)

}