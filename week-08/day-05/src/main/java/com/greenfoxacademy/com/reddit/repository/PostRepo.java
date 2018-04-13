package com.greenfoxacademy.com.reddit.repository;

import com.greenfoxacademy.com.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post, Long> {
  List<Post> findAllByOrderByVoteDesc();
}
