package com.bridgelabz.springHello.SpringHelloApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String message(){
        return "Hello from BridgeLabz";
    }
}
