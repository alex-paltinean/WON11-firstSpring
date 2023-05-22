package org.fasttrackit.firstSpring.homework;

import org.springframework.stereotype.Component;

@Component
public class Main {

    private final PersonService personService;

    public Main(PersonService personService) {
        this.personService = personService;
        // test methods
        System.out.println(personService.getNames());
    }
}
