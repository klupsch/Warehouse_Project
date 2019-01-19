package com.warehouse_project.warehouse.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ProductDictionary {

    @Id
    private Long ean;
    @Column(length = 15)
    private String code;
    @Column(length = 50)
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(length = 10)
    private String unit;
    @OneToMany
    private List<ProductAcceptance> productAcceptanceList = new ArrayList<>();


    public Long getEan() {
        return ean;
    }

    public void setEan(Long ean) {
        this.ean = ean;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
