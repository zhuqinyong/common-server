package me.tsinyong.commonprovider.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @PostMapping("/hi")
    public String hi() {
        return "hi";
    }
}
