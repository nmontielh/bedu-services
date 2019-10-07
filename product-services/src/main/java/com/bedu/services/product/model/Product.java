package com.bedu.services.product.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @see entity that represents a product to buy
 * @author montieln
 *
 */
@Getter
@Setter
@NoArgsConstructor
@ToString(includeFieldNames = true)
@EqualsAndHashCode
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String serial;
	private String description;

	private BigDecimal price;

	public Product(String name, String serial) {
		this.name = name;
		this.serial = serial;
	}

}
