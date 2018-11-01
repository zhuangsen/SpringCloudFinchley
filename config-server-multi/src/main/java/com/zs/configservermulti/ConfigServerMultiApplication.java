package com.zs.configservermulti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer//开启配置服务器的支持
@EnableDiscoveryClient
@EnableEurekaClient//开启 Eureka 客户端的支持
public class ConfigServerMultiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerMultiApplication.class, args);
	}
}
