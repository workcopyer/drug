package com.cpwk.drug.service;

import com.cpwk.drug.entity.drug;
import com.cpwk.drug.mapper.drugMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class drugService {
    @Autowired
    private drugMapper drugMapper;
    public drug getDrugById(Integer id){
        return drugMapper.getDrugById(id);
    }

    public void delete(Integer id){
        drugMapper.delete(id);
    }

    public void updatePrice(Integer id, Integer price){
        drugMapper.updatePrice(id,price);
    }

    public void updateAmount(Integer id, Integer amount){
        drugMapper.updateAmount(id,amount);
    }

    public void insert(drug d){
        drugMapper.insert(d);
    }

}
