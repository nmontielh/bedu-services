package com.bedu.services.product.model;

import java.io.Serializable;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(includeFieldNames = true)
@EqualsAndHashCode
public class Response implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer errorCode;
	private String description;
	private String details;
	
	private Serializable entity;
	private List<?> entities;

	public Response(Integer errorCode, String description, String details) {
		super();
		this.errorCode = errorCode;
		this.description = description;
		this.details = details;
	}

	public Response(Integer errorCode, String description, String details, Serializable entity) {
		super();
		this.errorCode = errorCode;
		this.description = description;
		this.details = details;
		this.entity = entity;
	}
	
	

}