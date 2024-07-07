package dev.manyroads;

import dev.manyroads.enums.EnumTest;
import dev.manyroads.lombok.Employee;
import dev.manyroads.lombok.Person;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class);

        Employee employee = new Employee("Naampje", 100);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        Person person = new Person("tedje", "bedrijfje");
        System.out.println(person);


/*
        EnumTest enumTest = EnumTest.valueOf("een");
        System.out.println(": " + enumTest);


        TestGenerics<String> testGenerics = new TestGenerics<String>();
        testGenerics.setT("gekke");
        testGenerics.optellen("henkie");

 */

        // Printing constant out of TestConstants class
        //System.out.println("Constant: " + TEST_TELLER);

        // checkingFormats();

    }

    static void checkingFormats() {

        /**
         * Checking formats of Map, List and JSON objects
         */
        String jwt = "mmcmalckmldackmldkmc";
        var tokenBody = Map.of("access_token", jwt);
        // Creates Array by way of List
        var tokenBody2 = List.of("access_token", jwt);
        // prints out tokenBody: {access_token=mmcmalckmldackmldkmc}
        System.out.println("tokenBody: " + tokenBody);

        // prints out tokenBody2: [access_token, mmcmalckmldackmldkmc]
        System.out.println("tokenBody2: " + tokenBody2);

        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("client_id", "client");
        requestBody.put("redirect_uri", "http://localhost:8082/token");
        requestBody.put("grant_type", "authorization_code");
        requestBody.put("code", "authCode");

        // prints out requestBody: {code=authCode, grant_type=authorization_code, redirect_uri=http://localhost:8082/token, client_id=client}
        System.out.println("requestBody: " + requestBody);

        JSONObject jsonObject = new JSONObject(requestBody);

        // Prints out jsonObject: {"code":"authCode","redirect_uri":"http://localhost:8082/token","grant_type":"authorization_code","client_id":"client"}
        System.out.println("jsonObject: " + jsonObject);

        JSONObject json = new JSONObject()
                .put("message", "message")
                .put("served-by", "HOSTNAME");

        // Prints out json: {"served-by":"HOSTNAME","message":"message"}
        System.out.println("json: " + json);
    }
}
