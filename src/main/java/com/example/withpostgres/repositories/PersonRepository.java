package com.example.withpostgres.repositories;

import com.example.withpostgres.models.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    List<Person> findAllByOrderByIdAsc();
    Person findOneById(int id);
}
