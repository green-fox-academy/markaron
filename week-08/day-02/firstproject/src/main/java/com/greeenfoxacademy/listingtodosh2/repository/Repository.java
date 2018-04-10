package com.greeenfoxacademy.listingtodosh2.repository;

import com.greeenfoxacademy.listingtodosh2.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<ToDo, Long> {
}
