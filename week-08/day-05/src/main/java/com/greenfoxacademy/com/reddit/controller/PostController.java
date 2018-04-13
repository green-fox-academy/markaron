package com.greenfoxacademy.com.reddit.controller;

import com.greenfoxacademy.com.reddit.model.Post;
import com.greenfoxacademy.com.reddit.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

  @Autowired
  PostRepo postRepo;

  @GetMapping(value = {"/", "/reddit"})
  public String mainPage(Model model){
    model.addAttribute("posts", postRepo.findAll());
    return "mainpage";
  }

  @GetMapping(value = "/reddit/addpost")
  public String addPostPage(){
    return "addpost";
  }

  @PostMapping("/reddit/addpost")
  public String addPost(@ModelAttribute(name = "post") String postMassage,
                        @ModelAttribute(name = "url") String url){
    postRepo.save(new Post(postMassage, url));
    return "redirect:/reddit";
  }
}
