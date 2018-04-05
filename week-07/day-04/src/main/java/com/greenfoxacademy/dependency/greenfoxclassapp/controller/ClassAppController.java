package com.greenfoxacademy.dependency.greenfoxclassapp.controller;

import com.greenfoxacademy.dependency.greenfoxclassapp.model.StudentService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClassAppController {

  @Autowired
  StudentService studentService;

  @GetMapping("/gfa")
  public String mainLink(Model model){
    model.addAttribute("counter",studentService.count());
    return "gfa";
  }

  @GetMapping("/gfa/list")
  public String getList(Model model){
    model.addAttribute("list",studentService.findAll());
    return "list";
  }

  @GetMapping("/gfa/add")
  public String addStudent(){
    return "add";
  }

  @PostMapping("/saver")
  public String getSaver(@ModelAttribute(name = "kid") String kidname, Model model){
    studentService.save(kidname);
    return "save";
  }
}
