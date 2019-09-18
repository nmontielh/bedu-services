package com.bedu.services.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Iniciador de la aplicacion de Spring boot
 * 
 * @author montieln
 *
 */
@SpringBootApplication
public class ProductServicesApplication {

	private static Logger log = LoggerFactory.getLogger(ProductServicesApplication.class);

	public static void main(String[] args) {

		log.info("Loading..");

		SpringApplication.run(ProductServicesApplication.class, args);
	}

}
