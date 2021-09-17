package com.cpwk.drug.controller;

import com.cpwk.drug.entity.drug;
import com.cpwk.drug.service.drugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping()
@RestController
public class drugController {
    @Autowired
    private drugService drugService;
    @RequestMapping()
    public drug getDrugById(Integer id){
        return drugService.getDrugById(id);
    }

    public void delete(Integer id){
        drugService.delete(id);
    }

    public void updatePrice(Integer id, Integer price){
        drugService.updatePrice(id,price);
    }

    public void updateAmount(Integer id, Integer amount){
        drugService.updateAmount(id,amount);
    }

    public void insert(drug d){
        drugService.insert(d);
    }

}
