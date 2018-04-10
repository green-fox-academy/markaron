package com.greenfoxacademy.secondproject.controller;

import com.greenfoxacademy.secondproject.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  @Autowired
  Repository repo;

  @GetMapping(value = {"/todo", "/todo/list"})
  public String list(Model model, @RequestParam (name = "isActive", required = false) boolean isDone){
    if (isDone){
      model.addAttribute("todos", repo.findAllByDone(!isDone));
    } else {
      model.addAttribute("todos", repo.findAll());
    }
    return "todo";
  }
}


