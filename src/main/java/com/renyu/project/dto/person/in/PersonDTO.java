package com.renyu.project.dto.person.in;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.renyu.project.model.Person;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class PersonDTO {

    @NotBlank
    @JsonProperty("first_name")
    private String firstName;
    @NotBlank
    @JsonProperty("last_name")
    private String lastName;
    @Email
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
