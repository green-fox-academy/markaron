package com.greenfoxacademy.dependency.greenfoxclassapp.controller;

import com.greenfoxacademy.dependency.greenfoxclassapp.model.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClassAppController {

  @Autowired
  StudentService studentService;

  @GetMapping("/gfa")
  public String mainLink(){
    return "gfa";
  }

  @GetMapping("/gfa/list")
  public String getList(Model model){
    model.addAttribute("list",studentService.findAll());
    return "list";
  }
}
