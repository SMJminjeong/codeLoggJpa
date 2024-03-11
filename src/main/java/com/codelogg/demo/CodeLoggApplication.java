package com.codelogg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeLoggApplication {

	//lombok 설정 후 preferences > annotation Processonrs > enabled annotation prpcessing 체크하기
	public static void main(String[] args) {

		SpringApplication.run(CodeLoggApplication.class, args);
	}

}
