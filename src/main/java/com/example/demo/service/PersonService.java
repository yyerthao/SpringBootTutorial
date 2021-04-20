package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;

public class PersonService{

    private final PersonDao personDao;

    public PersonService(PersonDao personDao){
        this.personDao = personDao;
    }

    public int addPerson(@Qualifier("fakedao") Person person){
        return personDao.insertPerson(person);
    }

}