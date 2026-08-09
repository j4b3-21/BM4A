package com.bm4a.platform.health.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController

public class HealthController {

    @GetMapping("/")

    public String home() {

        return "BM4A Platform is running";

    }

    @GetMapping("/health")

    public String health() {

        return "OK";

    }

    @GetMapping("/api/test")

    public Map<String, Object> test(

            @AuthenticationPrincipal Jwt jwt

    ) {

        return Map.of(

                "message", "Authenticated successfully",

                "subject", jwt.getSubject(),

                "username", jwt.getClaimAsString("preferred_username"),

                "email", jwt.getClaimAsString("email")

        );

    }

}