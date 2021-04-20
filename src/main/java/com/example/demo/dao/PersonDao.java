package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonDao {

    // defining method here
    // return an integer and mock a DB
    // UUID is the actual id
    int insertPerson (UUID id, Person person);

    // create a default method
    // this will be the same thing, allows us to generate the UUID/actual ids
    default int addPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

}


// NOTES
// int insertPerson gives us a person WITH an id
// default int addPerson will give us a person with a randomly generated ID

