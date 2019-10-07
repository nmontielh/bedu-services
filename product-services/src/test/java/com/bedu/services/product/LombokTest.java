package com.bedu.services.product;

import org.junit.Test;

import com.bedu.services.product.model.Product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LombokTest {

	@Test
	public void createObjectSetup() {
		log.info("Testing lombok");

		String name = "test product";
		String serial = "12345werty";

		Product product = new Product(name, serial);

		log.info("product:{}", product);

	}

}
