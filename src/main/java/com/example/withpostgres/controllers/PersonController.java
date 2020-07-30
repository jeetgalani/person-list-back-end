package com.example.withpostgres.controllers;

import com.example.withpostgres.models.Person;
import com.example.withpostgres.repositories.PersonRepository;
import com.example.withpostgres.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api")
class PersonController {

    @Autowired
    PersonRepository repository;

    @Autowired
    PersonService personService;

    @GetMapping("/person")
    public List<Person> getPersonList() {
        return personService.getPersonList();
    }

    @PostMapping("/person")
    public Person addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @PutMapping("/person/{id}")
    public Person editPerson(@RequestBody Person person, @PathVariable int id) {
        return personService.editPerson(person, id);
    }

    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable int id) {
        personService.deletePerson(id);
    }
}
