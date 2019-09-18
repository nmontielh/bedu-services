package com.bedu.services.product.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entidad que representa un producto
 * 
 * @author montieln
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class MyAwsomeProduct implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private String serial;

	public MyAwsomeProduct(String name, String serial) {
		super();
		this.name = name;
		this.serial = serial;
	}

}
