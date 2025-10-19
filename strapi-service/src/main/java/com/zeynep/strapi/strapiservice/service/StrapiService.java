package com.zeynep.strapi.strapiservice.service;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class StrapiService {

    private final WebClient webClient;

  

    public StrapiService(
            @Value("${strapi.api.base-url}") String baseUrl,
            @Value("${strapi.api.token}") String token) {

        this.webClient = WebClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader("Authorization", "Bearer " + token)
                .build();
    }
    
    public Mono<String> getPosts() {
        return webClient.get()
                .uri("/posts?populate=*")
                .retrieve()
                .bodyToMono(String.class);
    }
    

}