package com.bank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.spring.web.plugins.Docket;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;

@Configuration
public class SwaggerConfig {
	@Bean
	public Docket dockConfig() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("api").select()
				.apis(RequestHandlerSelectors.basePackage("com.bank")).paths(PathSelectors.any()).build();
	}
}
