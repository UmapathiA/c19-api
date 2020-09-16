package com.c19.api.c19api.repository;

import com.c19.api.c19api.entities.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class C19Api {
    @Autowired
    C19Repository c19Repository;

    @GetMapping("/")
    public Response getApi() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity<Response> exchange = restTemplate.exchange("https://api.covid19india.org/raw_data3.json", HttpMethod.GET, httpEntity, Response.class);
        Arrays.stream(exchange.getBody().getRawData()).forEach(x-> {
            c19Repository.save(x);
        });
        return exchange.getBody();
    }
}
