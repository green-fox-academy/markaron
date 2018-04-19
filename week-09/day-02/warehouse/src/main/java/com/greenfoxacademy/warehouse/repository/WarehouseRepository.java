package com.greenfoxacademy.warehouse.repository;

import com.greenfoxacademy.warehouse.model.Warehouse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WarehouseRepository extends CrudRepository<Warehouse, Long> {
  @Query("select distinct c.itemName from Warehouse c")
  List<String> findDistinctByItemName();

  @Query("select distinct a.size from Warehouse a")
  List<String> findDistinctBySize();

  @Query("select c from Warehouse c where c.itemName like :itemName and c.size like :itemSize")
  List<Warehouse> findByItemNameAndSize(@Param("itemName") String itemNameInput,
                            @Param("itemSize") String itemSizeInput);


  @Query("select c.manufacturer from Warehouse c where c.size like :itemSize and c.itemName like :itemName")
  String findBySizeAndItemName(@Param("itemSize") String itemSizeInput,
                               @Param("itemName") String itemNameInput);

  @Query("select c.category from Warehouse c where c.itemName like :itemName")
  List<String> findDistinctFirstByItemName(@Param("itemName") String itemNameInput);
}
