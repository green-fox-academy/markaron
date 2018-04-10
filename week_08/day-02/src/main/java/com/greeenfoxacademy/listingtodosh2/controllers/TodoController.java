package com.greeenfoxacademy.listingtodosh2.controllers;

import com.greeenfoxacademy.listingtodosh2.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  @Autowired
  Repository repo;

  @GetMapping(value = {"/todo", "/todo/list"})
  public String list(Model model){
    return "todo";
  }
}

