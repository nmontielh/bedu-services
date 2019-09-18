package com.bedu.services.product.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bedu.services.product.service.ProductService;

//http://localhost:8080/api/v1/product/10/12
@RestController
@RequestMapping("/api/v1")
public class ProductEndpoint {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ProductService service;

	@GetMapping("/product/{clientId}")
	public ResponseEntity<Object> read(@PathVariable("clientId") String clientId) {

		return null;
	}

}