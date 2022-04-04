package org.fiipractic.springdemo.repositories;

import org.fiipractic.springdemo.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
