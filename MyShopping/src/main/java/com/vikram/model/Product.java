package com.vikram.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;


import com.mysql.cj.jdbc.Blob;

@Entity
public class Product {
	@Id
	@Column(name = "idproduct")
	private int idproduct;
	
	@Column(name = "productimage")
	@Lob
	private byte productimage[];
	
	@Column(name = "productname")
	private String productname="";

	public int getIdproduct() {
		return idproduct;
	}

	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}

	

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Product(byte[] productimage, String productname) {
		super();
		this.productimage = productimage;
		this.productname = productname;
	}
	
	public byte[] getProductimage() {
		return productimage;
	}

	public void setProductimage(byte[] productimage) {
		this.productimage = productimage;
	}

	public Product() {
		
	}
}
