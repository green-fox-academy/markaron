package com.greeenfoxacademy.listingtodosh2;

import com.greeenfoxacademy.listingtodosh2.model.ToDo;
import com.greeenfoxacademy.listingtodosh2.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtodosh2Application implements CommandLineRunner {

	@Autowired
	Repository repository;

	public static void main(String[] args) {
		SpringApplication.run(Listingtodosh2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new ToDo("I have to learn Object Relational Mapping"));
		repository.save(new ToDo("Drink beer!!!!!!"));
		repository.save(new ToDo("Drink coffee"));
	}
}
