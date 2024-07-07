package dev.manyroads.controllers;

import dev.manyroads.exceptions.TestIOException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    /**
     * Creation of JSON response. Spring automatically converts Map in to JSON object
     *
     * @return
     */
    @GetMapping("/test")
    public Map<String, String> generateJSON() {

        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("client_id", "client");
        requestBody.put("redirect_uri", "http://localhost:8082/token");
        requestBody.put("grant_type", "authorization_code");
        requestBody.put("code", "authCode");

        return requestBody;

        // Displays at terminal
        // http://localhost:8080/test
        // {
        //  "code": "authCode",
        //  "grant_type": "authorization_code",
        //  "redirect_uri": "http://localhost:8082/token",
        //  "client_id": "client"
        //}
    }

    @GetMapping("/advice")
    public String testAdviceController() throws IOException {

        System.out.println("In testAdviceController");

        int i = 1;

        if (i == 1) throw new TestIOException();

        return "Alles goed!";
    }
}


