package com.githubactions.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	@GetMapping("/welcome")
	public String welcometo() {
		return "welcome";
	}
//	echo "# github-actions" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/vijay466/github-actions.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
