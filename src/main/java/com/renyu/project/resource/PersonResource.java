package com.renyu.project.resource;

import com.renyu.project.dto.person.in.PersonDTO;
import com.renyu.project.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/persons")
public class PersonResource {

    private final PersonService personService;

    @Autowired
    public PersonResource(final PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity savePerson(@RequestBody @Valid final PersonDTO personDTO) {
        this.personService.savePerson(personDTO.toPerson());

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
