package com.bedu.services.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * Iniciador de la aplicacion de Spring boot
 * 
 * @author montieln
 *
 */
@Slf4j
@SpringBootApplication
public class ProductServicesApplication {

	public static void main(String[] args) {

		log.info("Loading Product Microservices..");

		SpringApplication.run(ProductServicesApplication.class, args);
	}

}