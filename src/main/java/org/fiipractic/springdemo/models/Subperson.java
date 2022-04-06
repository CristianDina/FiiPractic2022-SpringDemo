package org.fiipractic.springdemo.models;




import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
//@Table(name="subperson", schema="person")
public class Subperson extends Person{

    private String extraField;
}
