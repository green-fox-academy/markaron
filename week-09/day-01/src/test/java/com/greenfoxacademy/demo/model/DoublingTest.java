package com.greenfoxacademy.demo.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
  public void greeterErrorNoName() throws Exception {
    mockMvc
      .perform(get("/greeter").param("title","student"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.error").value("Please provide a name!"));
  }

  @Test
  public void greeterErrorNoTitle() throws Exception {
    mockMvc
      .perform(get("/greeter").param("name","Vader"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.error").value("Please provide a title!"));
  }

  @Test
  public void append() throws Exception {
    mockMvc
      .perform(get("/appenda/{appendable}", "kuty"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.appended").value("kutya"));
  }

  @Test
  public void doUntil() throws Exception {
    mockMvc
      .perform(post("/dountil/{what}","sum")
          .contentType(MediaType.APPLICATION_JSON)
          .content("{\"until\": 5}"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.result").value(15));
  }
}
