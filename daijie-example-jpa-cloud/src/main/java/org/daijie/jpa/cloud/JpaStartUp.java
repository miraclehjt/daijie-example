package org.daijie.jpa.cloud;

import org.daijie.core.swagger.EnableMySwagger;
import org.daijie.jdbc.annotation.EnableJpa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableJpa
@EnableMySwagger
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RefreshScope
public class JpaStartUp {

	public static void main(String[] args) {
		SpringApplication.run(JpaStartUp.class, args);
	}
}
