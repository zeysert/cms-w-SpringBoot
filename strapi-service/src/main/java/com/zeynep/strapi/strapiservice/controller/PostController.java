package com.zeynep.strapi.strapiservice.controller;

import com.zeynep.strapi.strapiservice.service.StrapiService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final StrapiService strapiService;

    public PostController(StrapiService strapiService) {
        this.strapiService = strapiService;
    }

    @GetMapping
    public Mono<String> getAllPosts() {
        return strapiService.getPosts();
    }
}
