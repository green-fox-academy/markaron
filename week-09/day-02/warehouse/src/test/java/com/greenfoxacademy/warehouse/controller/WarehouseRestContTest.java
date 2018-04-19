package com.greenfoxacademy.warehouse.controller;

import com.greenfoxacademy.warehouse.model.Warehouse;
import com.greenfoxacademy.warehouse.repository.WarehouseRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyFloat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WarehouseRestCont.class)
@WebAppConfiguration
@EnableWebMvc
public class WarehouseRestContTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
    MediaType.APPLICATION_JSON.getSubtype(),
    Charset.forName("utf8"));

  private MockMvc mockMvc;

  @MockBean
  WarehouseRepository warehouseRepository;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void jsonResponseTest() throws Exception {
    List<Warehouse> warehouseList = Arrays.asList(new Warehouse(), new Warehouse());
    when(warehouseRepository.findByUnitPriceIsLessThan(anyFloat())).thenReturn(warehouseList);

    mockMvc.perform(get("http://localhost:8080/warehouse/query?price=80&type=lower"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.warehouseList[0].id").value(0));
  }
}