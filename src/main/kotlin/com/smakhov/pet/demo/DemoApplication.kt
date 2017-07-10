package com.smakhov.pet.demo

import com.smakhov.pet.demo.customer.Customer
import com.smakhov.pet.demo.customer.CustomerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.reactive.function.BodyInserters.fromObject
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@SpringBootApplication
class DemoApplication {

    @Bean
    fun appRouter(customerRepository: CustomerRepository) = router {
        GET("/customers", { ServerResponse.ok().body(fromObject(customerRepository::findAll)) })
    }

    @Bean
    fun init(repo: CustomerRepository) = CommandLineRunner {
        repo.save(Customer("Jack", "Bauer"))
        repo.save(Customer("John", "Doe"))
        repo.save(Customer("Serhii", "Makhov"))
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}
