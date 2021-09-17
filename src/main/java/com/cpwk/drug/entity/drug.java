package com.cpwk.drug.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class drug {
    private Integer id;
    private String name;
    private String standard;
    private String form;
    private String producer;
    private String company;
    private Float price;
    private String mcompany;
    private String coef;
    private String pycode;
    private String wbcode;
    private String anumber;
    private Boolean insurance;
    private String category;
    private String ratio;
}
