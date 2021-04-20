package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/person")
@RestController // this allows us methods and to expose endpoints
public class PersonController {

    //need to reference to actual service
    private final PersonService personService;

    // dependency injection happens here
    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    // need to have below method serve as post request
    @PostMapping // this is from the spring framework to utilize post method
    // @RequestBody, says we want to take this json object into a Person --
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }
}
