package com.greenfoxacademy.warehouse.repository;

import com.greenfoxacademy.warehouse.model.Warehouse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface WarehouseRepository extends CrudRepository<Warehouse, Long>{
  @Query("select distinct c.itemName from Warehouse c")
  List<String> findDistinctByItemName();

  @Query("select distinct a.size from Warehouse a")
  List<String> findDistinctBySize();

  @Query("select c.unitPrice from Warehouse c where c.itemName like :itemName and c.size like :itemSize")
  int findByItemNameAndSize(@Param("itemName") String itemNameInput,
                                     @Param("itemSize") String itemSizeInput);
}
