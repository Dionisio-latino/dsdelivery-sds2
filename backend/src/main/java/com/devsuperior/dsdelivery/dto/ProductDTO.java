package com.devsuperior.dsdelivery.dto;

import java.io.Serializable;

import com.devsuperior.dsdelivery.entities.Products;

public class ProductDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double price;
	private String descriptions;
	private String imageUri;
	
	public ProductDTO() {
		
	}

	public ProductDTO(Long id, String name, Double price, String descriptions, String imageUri) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.descriptions = descriptions;
		this.imageUri = imageUri;
	}
	
	public ProductDTO(Products entity) {
		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
		descriptions = entity.getDescriptions();
		imageUri = entity.getImageUri();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	
	
	
}
