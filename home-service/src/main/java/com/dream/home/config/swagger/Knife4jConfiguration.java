package com.dream.home.config.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author 50699
 */
@EnableSwagger2WebMvc
@Configuration
public class Knife4jConfiguration {

    @Value(value = "${knife4j.info.group-name}")
    private String groupName;

    @Value(value = "${knife4j.contact.name}")
    private String name;

    @Value(value = "${knife4j.contact.url}")
    private String url;

    @Value(value = "${knife4j.contact.email}")
    private String email;

    @Value(value = "${knife4j.info.base-package}")
    private String basePackage;

    @Value(value = "${knife4j.info.title}")
    private String title;

    @Value(value = "${knife4j.info.description}")
    private String description;

    @Value(value = "${knife4j.info.version}")
    private String version;

    @Value(value = "${knife4j.info.service-url}")
    private String serviceUrl;

    @Value(value = "${knife4j.info.license}")
    private String license;

    @Value(value = "${knife4j.info.license-url}")
    private String licenseUrl;

    @Bean
    public Docket defaultApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(true)
                .apiInfo(apiInfo())
                //分组名称
                .groupName(groupName)
                .select()
                //这里指定扫描包路径
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 展示主页基础信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                .termsOfServiceUrl(serviceUrl)
                .contact(new Contact(name, url, email))
                .version(version)
                .license(license)
                .licenseUrl(licenseUrl)
                .build();
    }
}
