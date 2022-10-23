package com.example.springbootpostgresqltesting.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Person(
    val firstname: String,
    val lastname: String,
    val dateOfBirth: LocalDateTime,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq_gen")
    @SequenceGenerator(name = "person_seq_gen", sequenceName = "person_seq", allocationSize = 1)
    val id: Long? = null
}