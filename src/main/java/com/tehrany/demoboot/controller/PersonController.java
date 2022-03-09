package com.tehrany.demoboot.controller;

import com.tehrany.demoboot.model.entity.Car;
import com.tehrany.demoboot.model.entity.Person;
import com.tehrany.demoboot.model.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void save(@RequestBody Person person) {
        try {
            System.out.println(person.getFamily());
            System.out.println(person.getName());
            System.out.println(person.getCars().size());
            for (Car car : person.getCars()) {
                System.out.println(car.getModel());
            }
            //personService.register(person);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
