package com.test.coddix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.test.coddix.repository")
@EnableJpaRepositories(basePackages = "com.test.coddix.jpa.repository")
public class TestElasticsearchPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestElasticsearchPostgresApplication.class, args);
	}

}
