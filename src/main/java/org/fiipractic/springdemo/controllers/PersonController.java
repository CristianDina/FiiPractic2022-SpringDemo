package org.fiipractic.springdemo.controllers;


import org.fiipractic.springdemo.models.Person;
import org.fiipractic.springdemo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/getPerson/{cnp}")
    public ResponseEntity<Person> getPerson(@PathVariable Integer cnp){
        Person person = personService.getPerson(cnp);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @GetMapping("/getAllPersons")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @PutMapping("/updatePerson")
    public void updatePerson(@RequestBody Person person){
        personService.updatePerson(person);
    }

    @DeleteMapping("/deletePerson/{cnp}")
    public void deletePerson(@PathVariable Integer cnp){
        personService.deletePerson(cnp);
    }
}
