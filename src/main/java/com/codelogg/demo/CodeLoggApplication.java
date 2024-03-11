package com.codelogg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeLoggApplication {

	//lombok 설정 후 preferences > annotation Processonrs > enabled annotation prpcessing 체크하기
	public static void main(String[] args) {

		Hello hello = new Hello();
		hello.setData("hello");
		String data = hello.getData();
		System.out.println("data = " + data);

		SpringApplication.run(CodeLoggApplication.class, args);
	}

}
