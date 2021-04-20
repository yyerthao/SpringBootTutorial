package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);

    // this generates id for new person
    default int insertPerson (Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(person);
    }
}


// NOTES
// int insertPerson gives us a person WITH an id
// default int addPerson will give us a person with a randomly generated ID

