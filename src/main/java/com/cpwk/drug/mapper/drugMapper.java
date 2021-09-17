package com.cpwk.drug.mapper;

import com.cpwk.drug.entity.drug;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface drugMapper {

    List<drug> getAll();

    drug getDrugById(Integer id);

    void delete(Integer id);

    void updatePrice(Integer id, Integer price);

    void updateAmount(Integer id, Integer amount);

    void insert(drug d);

}