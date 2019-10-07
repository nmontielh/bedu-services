package com.bedu.services.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.bedu.services.product.model.Product;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@ConfigurationProperties("products")
@Getter
@Setter
@NoArgsConstructor
@ToString(includeFieldNames = true)
@EqualsAndHashCode
public class ProductsCatalogs {
	
	private List<Product> products = new ArrayList<>();
	

}
