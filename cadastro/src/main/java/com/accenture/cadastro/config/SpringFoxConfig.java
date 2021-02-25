package com.accenture.cadastro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SpringFoxConfig {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.accenture"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Documentação (CRUD)")
				.description("Sistema de Gerenciamento de Alunos - Que permite o Cadastro, Inclusão, Consulta e Exclusão de Alunos.")
				.version("1.0")
				.contact(contact())
				.build();
	}
	
	private Contact contact() {
		return new Contact("Gamados por Java",
				"https://github.com/EdileneLopes/accenture-java",
				"lopes_edi@yahoo.com.br");
	}
}