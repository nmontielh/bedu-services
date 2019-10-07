package com.bedu.services.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Object thant represents an Order to buy a product
 * 
 * @author montieln
 *
 */
@Getter
@Setter
@NoArgsConstructor
@ToString(includeFieldNames = true)
@EqualsAndHashCode()
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	private String client;
	private Map<String, BigDecimal> details;
	private BigDecimal total;

	public Order(String client, Map<String, BigDecimal> details, BigDecimal total) {
		super();
		this.client = client;
		this.details = details;
		this.total = total;
	}

}
