package com.zs.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${service.client.name}")
    private String clientName;

    public String hiService(String name) {
        return restTemplate.getForObject("http://" + clientName + "/hi?name=" + name, String.class);
    }
}