package com.renyu.project.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_persons")
@SequenceGenerator(name="person_gen", sequenceName="seq_person", allocationSize=1)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_gen")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;

}
