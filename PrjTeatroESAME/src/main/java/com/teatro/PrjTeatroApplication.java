package com.teatro;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.teatro.services.TeatroServiceImpl;

@SpringBootApplication
public class PrjTeatroApplication{

	public static void main(String[] args) {
		
		SpringApplication.run(PrjTeatroApplication.class, args);
		

}}

