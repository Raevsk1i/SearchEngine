package com.searchEngine.controllers;

import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ManagementController {

    @GetMapping("/startIndexing")
    public Response startIndexing() {
       Response response = new Response();
       response.setContentType("application/json");
       response.setMessage("{\"result\": \"true\"}");
       response.setStatus(200);
       return response;
    }
}
