package com.greenfoxacademy.dependency;

import com.greenfoxacademy.dependency.Color.RedColor;
import com.greenfoxacademy.dependency.hellobeanworld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyApplication implements CommandLineRunner{

	@Autowired
	Printer printer;

	@Autowired
	RedColor redColor;

	public static void main(String[] args) {
		SpringApplication.run(DependencyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		printer.log("hello");
		redColor.printColor();
	}
}
