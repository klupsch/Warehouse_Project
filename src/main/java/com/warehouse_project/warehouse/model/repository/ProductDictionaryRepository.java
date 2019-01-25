package com.warehouse_project.warehouse.model.repository;

import com.warehouse_project.warehouse.model.entity.ProductDictionary;
import com.warehouse_project.warehouse.model.entity.ProductPool;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDictionaryRepository extends CrudRepository<ProductDictionary, Long> {
}
