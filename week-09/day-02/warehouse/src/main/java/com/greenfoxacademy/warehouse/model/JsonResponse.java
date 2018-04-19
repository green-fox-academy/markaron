package com.greenfoxacademy.warehouse.model;

import java.util.List;

public class JsonResponse {
  private String result;
  private List<Warehouse> warehouseList;

  public JsonResponse() {
  }

  public JsonResponse(String result) {
    this.result = result;
  }

  public JsonResponse(String result, List<Warehouse> warehouseList) {
    this.result = result;
    this.warehouseList = warehouseList;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Warehouse> getWarehouseList() {
    return warehouseList;
  }

  public void setWarehouseList(List<Warehouse> warehouseList) {
    this.warehouseList = warehouseList;
  }
}
