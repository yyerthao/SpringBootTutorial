package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService{

    private final PersonDao personDao;

    // auto-wiring into this interface
    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao){
        this.personDao = personDao;
    }

    public int addPerson(@Qualifier("fakeDao") Person person){
        return personDao.insertPerson(person);
    }

}


// need annotations to instantiate BEANS