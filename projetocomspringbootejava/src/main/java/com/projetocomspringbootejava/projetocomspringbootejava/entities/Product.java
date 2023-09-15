package com.projetocomspringbootejava.projetocomspringbootejava.entities;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Double proce;
	
	
	private Category category;
	
	
	public Product() {
		
	}


	public Product(Long id, String name, Double proce, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.proce = proce;
		this.category = category;
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


	public Double getProce() {
		return proce;
	}


	public void setProce(Double proce) {
		this.proce = proce;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
