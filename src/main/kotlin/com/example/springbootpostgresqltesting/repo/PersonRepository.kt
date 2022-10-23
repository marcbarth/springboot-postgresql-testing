package com.example.springbootpostgresqltesting.repo

import com.example.springbootpostgresqltesting.model.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person, Long> {

    fun findPersonByFirstnameAndLastname(firstName: String, lastName: String): List<Person>
}