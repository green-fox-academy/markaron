package com.greenfoxacademy.warehouse.repository;

import com.greenfoxacademy.warehouse.model.Warehouse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WarehouseRepository extends CrudRepository<Warehouse, Long>{
  @Query("select distinct c.itemName from Warehouse c")
  List<String> findDistinctByItemName();
}
