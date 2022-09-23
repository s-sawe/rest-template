package com.sawe.resttempcallingservice.service;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class RestTempService {

    RestTemplate restTemplate = new RestTemplate();

    private static final String get_All_Users_URL = "http://localhost:9090/users";
    private static final String create_All_Users_URL = "http://localhost:9090/addUser";

    public ResponseEntity<String> getAllUsers(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        //headers.add("Authorization", headerValue); with tockens

        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        ResponseEntity<String> response = restTemplate.exchange(get_All_Users_URL, HttpMethod.GET, entity, String.class);
        return response;
    }

   /* public ResponseEntity<User> createUser(User user){
        return restTemplate.postForEntity(create_All_Users_URL, user, User.class);

    }*/
}
