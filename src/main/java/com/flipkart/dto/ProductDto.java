package com.flipkart.dto;

import com.flipkart.domain.Product;

public class ProductDto {
    private String sellerName;

    public ProductDto(Product employee) {
        this.sellerName = employee.getSellerName();
        this.productName = employee.getProductName();
        this.category = employee.getCategory();
        this.description = employee.getDescription();
        this.cost = employee.getCost();
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    private String productName;

    private String category;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    private long cost;

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                ", sellerName='" + sellerName + '\'' +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
