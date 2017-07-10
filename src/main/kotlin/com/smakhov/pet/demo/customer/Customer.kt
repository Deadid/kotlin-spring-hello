package com.smakhov.pet.demo.customer

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by dead0 on 09.07.2017.
 */
@Entity
data class Customer(
        val lastName: String = "",
        val firstName: String = "",
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0)