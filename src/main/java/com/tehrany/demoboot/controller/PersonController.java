package com.tehrany.demoboot.controller;

import com.tehrany.demoboot.model.entity.Person;
import com.tehrany.demoboot.model.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/save")
    public ResponseEntity<Person> save(@RequestBody Person person) {
        personService.register(person);
        return ResponseEntity.ok(person);
    }
}
