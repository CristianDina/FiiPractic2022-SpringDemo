package org.fiipractic.springdemo.models;


import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="person", schema="person")
public class Person {
    @Id
    private Integer cnp;
    private String name;
    private Integer age;

}
