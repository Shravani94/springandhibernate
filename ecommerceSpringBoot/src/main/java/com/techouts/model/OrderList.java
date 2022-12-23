package com.techouts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orderList")
public class OrderList {
	@Id
	@Column(name="productid")
	private int productId;
	@Column(name="productimage")
	private String productImage;
	@Column(name="productcost")
	private String productCost;
	@Column(name="productdescription")
	private String productDescription;
	private String productcolor;
	private String tablename;
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public String getProductColor() {
		return productcolor;
	}

	public void setColor(String productColor) {
		this.productcolor = productColor;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public OrderList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProductList [productId=" + productId + ", productImage=" + productImage + ", productCost=" + productCost
				+ ", productDescription=" + productDescription + ", color=" + productcolor + ", tablename=" + tablename + "]";
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductCost() {
		return productCost;
	}

	public void setProductCost(String productCost) {
		this.productCost = productCost;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}
