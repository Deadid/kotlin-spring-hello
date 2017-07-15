package com.smakhov.pet.demo.customer

import javax.persistence.*

/**
 * Created by SMakhov on 09.07.2017.
 */
@Entity @Table(name = "customer")
data class Customer(
        var lastName: String = "",
        var firstName: String = "",
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long? = null)