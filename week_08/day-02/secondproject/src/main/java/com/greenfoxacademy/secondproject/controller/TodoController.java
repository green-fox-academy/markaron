package com.greenfoxacademy.secondproject.controller;

import com.greenfoxacademy.secondproject.model.Todo;
import com.greenfoxacademy.secondproject.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;

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

  @GetMapping(value = "/todo/adder")
  public String addTodoPage(){
    return "adder";
  }

  @PostMapping("/todo/adder")
  public String addTodo(@ModelAttribute(name = "todoDesc") String todoDescription){
    repo.save(new Todo(todoDescription));
    return "redirect:/todo";
  }
}


