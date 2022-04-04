package org.fiipractic.springdemo.services;

import org.fiipractic.springdemo.models.Person;
import org.fiipractic.springdemo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Person getPerson(Integer cnp){
        Person person = personRepository.findById(cnp).get();
        return person;
    }

    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public void updatePerson(Person person) {
        personRepository.save(person);
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public void deletePerson(Integer cnp) {
        personRepository.deleteById(cnp);
    }
}
