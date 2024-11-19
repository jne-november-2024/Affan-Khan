package com.test.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class versioningPersonController {


    @GetMapping("v1/person")
    public Person getFirstVersionOfPerson() {
        return new Person("Alex Harry");
    }


    @GetMapping("v2/person")
    public Person2 getSecondVersionOfPerson() {
        return new Person2(new Name("Bob", "Charlie"));
    }
    @GetMapping(path="person/",params="version=1")
    public Person getFirstVersionOfPersonRequestParameter() {
        return new Person("Alex Harry");
    }
    @GetMapping(path="person/",params="version=2")
    public Person2 getSecondVersionOfPersonRequestParameter() {
        return new Person2(new Name("Bob", "Charlie"));
    }
    @GetMapping(path="person/header",headers="X-API-Version=1")
    public Person getFirstVersionOfPersonRequestHeader() {
        return new Person("Alex Harry");
}
    @GetMapping(path="person/header",headers="X-API-Version=2")
    public Person2 getSecondVersionOfPersonRequestHeader() {
        return new Person2(new Name("Bob", "Charlie"));
    }
}
