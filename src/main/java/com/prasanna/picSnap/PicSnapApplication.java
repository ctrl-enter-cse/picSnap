package com.prasanna.picSnap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PicSnapApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicSnapApplication.class, args);
	}

}
