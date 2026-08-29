package com.bm4a.platform.health.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String getHello(){
        return "Hello Admin ";
    }
    @PreAuthorize("hasRole('MEMBER')")
    @GetMapping("/member")
    public String getBye(){
        return "Hello Member";
    }
}
