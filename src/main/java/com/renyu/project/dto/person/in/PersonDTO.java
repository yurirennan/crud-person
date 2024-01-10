package com.renyu.project.dto.person.in;

import com.renyu.project.model.Person;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PersonDTO {

    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String email;

    public Person toPerson() {
        final Person person = new Person();

        person.setFirstName(this.firstName);
        person.setLastName(this.lastName);
        person.setEmail(this.email);

        return person;
    }

}
