package com.greenfoxacademy.demo.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DoublingTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  public void doubling() throws Exception {
    mockMvc
      .perform(get("/doubling/?input=5"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.received").value(5))
      .andExpect(jsonPath("$.result").value(10));
  }
}