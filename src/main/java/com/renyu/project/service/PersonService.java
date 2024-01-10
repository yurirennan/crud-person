package com.renyu.project.service;

import com.renyu.project.model.Person;
import com.renyu.project.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void savePerson(final Person person) {
        this.personRepository.save(person);
    }

}
