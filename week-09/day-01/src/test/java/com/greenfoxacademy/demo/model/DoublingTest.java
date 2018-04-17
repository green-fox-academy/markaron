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
      .perform(get("/doubling").param("input","5"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.received").value(5))
      .andExpect(jsonPath("$.result").value(10));
  }

  @Test
  public void doublingError() throws Exception {
    mockMvc
      .perform(get("/doubling/?input="))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.error").value("Please provide an input!"));
  }

  @Test
  public void greeter() throws Exception {
    mockMvc
      .perform(get("/greeter/?name=Luke&title=hero"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.welcome_message").value("Oh, hi there Luke, my dear hero!"));
  }

  @Test
  public void greeterParam() throws Exception {
    mockMvc
      .perform(get("/greeter").param("name", "Joe").param("title","béna"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.welcome_message").value("Oh, hi there Joe, my dear béna!"));
  }

  @Test
  public void greeterError() throws Exception {
    mockMvc
      .perform(get("/greeter").param("title","student"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.error").value("Please provide a name!"));
  }
}