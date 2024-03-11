package com.example.camunda8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import io.camunda.zeebe.spring.client.annotation.Deployment;
import io.camunda.zeebe.spring.client.configuration.ZeebeClientProdAutoConfiguration;

@SpringBootApplication
@EnableZeebeClient
@Import(ZeebeClientProdAutoConfiguration.class)
@Deployment(resources="classpath:sample.bpmn")
public class Camunda8Application {

	public static void main(String[] args) {
		SpringApplication.run(Camunda8Application.class, args);
	}

}
