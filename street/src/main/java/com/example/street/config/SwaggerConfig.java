//package com.example.street.config;
//
//import static springfox.documentation.builders.PathSelectors.regex;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import io.swagger.models.Contact;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.schema.Collections;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.VendorExtension;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//	@Bean
//	public Docket productApi() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.street.apirest")).paths(regex("/api")).build()
//				.apiInfo(metaInfo());
//	}
//
//	private ApiInfo metaInfo() {
//		ApiInfo apiInfo = new ApiInfo("Produtos API REST", "API REST de cadastro de ruas.", "1.0", "Terms of Service",
//				new Contact(), "Apache Licenses Version 2.0", "https://www.apache.org/license.html",
//				new ArrayList<VendorExtension>());
//		return apiInfo;
//	}
//
//}
