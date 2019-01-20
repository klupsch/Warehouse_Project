package com.warehouse_project.warehouse.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class ProductPool {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 35)
    private String invoice;
    @ManyToOne
    private ProductAcceptance productAcceptance;
    private Date date;
    @Column(scale = 13, precision = 4)
    private BigDecimal count;

    public ProductPool(){}


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

    public ProductAcceptance getProductAcceptance() {
        return productAcceptance;
    }

    public void setProductAcceptance(ProductAcceptance productAcceptance) {
        this.productAcceptance = productAcceptance;
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


}
