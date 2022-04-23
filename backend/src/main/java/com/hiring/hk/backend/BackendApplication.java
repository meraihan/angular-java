package com.hiring.hk.backend;

import com.hiring.hk.backend.service.InitDataService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	@Resource
	InitDataService initDataService;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		initDataService.init();
	}

}
