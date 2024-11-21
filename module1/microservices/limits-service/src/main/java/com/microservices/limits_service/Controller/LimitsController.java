package com.microservices.limits_service.Controller;


import com.microservices.limits_service.bean.Limits;
import com.microservices.limits_service.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

  @Autowired
  private Configuration congiguration;

   @GetMapping("/limits")
    public Limits retrieveLimits()
    {  return  new Limits(congiguration.getMinimum(), congiguration.getMaximum());
//        return new Limits(1,1000);

    }
}
