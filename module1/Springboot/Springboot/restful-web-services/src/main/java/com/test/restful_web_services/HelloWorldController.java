package com.test.restful_web_services;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
   @GetMapping(path="/hello-world")
    public String helloWorld()
    {
        return "Hello World";
    }
    @GetMapping(path="/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name) {
        // Use the 'name' variable in the String.format() method
        return new HelloWorldBean(String.format("Hello, %s!", name));
    }

}
