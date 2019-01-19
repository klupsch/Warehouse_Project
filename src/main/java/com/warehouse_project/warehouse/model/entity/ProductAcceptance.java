package com.warehouse_project.warehouse.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class ProductAcceptance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 35)
    private String invoice;
    private ProductDictionary productDictionary;
    private Date date;
    @Column(scale = 13, precision = 4)
    private BigDecimal count;
    @Column(scale = 18, precision = 2)
    private BigDecimal price;

    public ProductAcceptance() {
    }

    public ProductAcceptance(String invoice, ProductDictionary productDictionary, Date date, BigDecimal count, BigDecimal price) {
        this.invoice = invoice;
        this.productDictionary = productDictionary;
        this.date = date;
        this.count = count;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public ProductDictionary getProductDictionary() {
        return productDictionary;
    }

    public void setProductDictionary(ProductDictionary productDictionary) {
        this.productDictionary = productDictionary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
