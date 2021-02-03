package com.dream.home;

import com.github.xiaoymin.knife4j.discovery.annotation.EnableKnife4jCloudDiscovery;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jovi
 */
@EnableKnife4jCloudDiscovery
@MapperScan(value = {"com.dream.home.mapper"})
@SpringBootApplication
public class HomeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeServiceApplication.class, args);
    }

}
