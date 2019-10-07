package com.bedu.services.product.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bedu.services.product.model.Product;
import com.bedu.services.product.model.Response;
import com.bedu.services.product.service.ProductService;

import lombok.extern.slf4j.Slf4j;

//http://localhost:8080/api/v1/product/
@Slf4j
@RestController
@RequestMapping("/api/v1")
public class ProductEndpoint {

	@Autowired
	private ProductService service;

	@GetMapping("/product/{clientId}")
	public ResponseEntity<Response> findProduct(@PathVariable("clientId") Integer idProduct) {

		log.debug("Getting a product detail {}", idProduct);

		// Creating the response object
		Response response = null;

		try {
			Product product = service.findProduct(idProduct);
			response = new Response(0, "Request sucessfull", "product found");
			response.setEntity(product);
		} catch (Exception e) {
			String details = e.getMessage();
			response = new Response(1, "Request unsucessfull", details);
		}
		//

		// TODO create a status resolver instead on this logic
		HttpStatus status = (response.getErrorCode().equals(0)) ? HttpStatus.ACCEPTED : HttpStatus.PRECONDITION_FAILED;

		ResponseEntity<Response> responseService = new ResponseEntity<Response>(response, status);

		return responseService;
	}

	@GetMapping("/product/")
	public ResponseEntity<Response> findAllProducts(@PathVariable("clientId") String clientId) {

		log.debug("Getting all products");

		// Creating the response object
		Response response = null;

		try {
			List<Product> products = service.findAllProducts();
			response = new Response(0, "Request sucessfull", "product found");
			response.setEntities(products);
		} catch (Exception e) {
			String details = e.getMessage();
			response = new Response(1, "Request unsucessfull", details);
		}
		//

		// TODO create a status resolver instead on this logic
		HttpStatus status = (response.getErrorCode().equals(0)) ? HttpStatus.ACCEPTED : HttpStatus.PRECONDITION_FAILED;

		ResponseEntity<Response> responseService = new ResponseEntity<Response>(response, status);

		return responseService;
	}

}