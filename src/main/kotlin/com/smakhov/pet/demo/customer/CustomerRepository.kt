package com.smakhov.pet.demo.customer

import org.springframework.data.repository.reactive.ReactiveCrudRepository

/**
 * Created by dead0 on 09.07.2017.
 */
interface CustomerRepository : ReactiveCrudRepository<Customer, Long>