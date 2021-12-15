package com.example.firstspringbootapp;

import Services.person;
import org.springframework.stereotype.com.example.firstspringbootapp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class controller {

    @RequestMapping(value="/addPerson", method = RequestMethod.GET)
    public void addPerson() {
        person person = new person();
        person.setName("Shivani");
        System.out.println(person);
    }
}
