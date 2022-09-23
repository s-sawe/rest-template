package com.sawe.resttempcallingservice.controller;

import com.sawe.resttempcallingservice.service.RestTempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RestTemplate")
public class RestTempController {

    @Autowired
    private RestTempService restTempService;

    @GetMapping("/users")
    public ResponseEntity<String> getUsers(){
        return restTempService.getAllUsers();
    }
}
