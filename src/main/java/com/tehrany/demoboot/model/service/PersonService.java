package com.tehrany.demoboot.model.service;

import com.tehrany.demoboot.model.entity.Person;
import com.tehrany.demoboot.model.repository.CarRepo;
import com.tehrany.demoboot.model.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepo personRepo;
    @Autowired
    private CarRepo carRepo;

    @Transactional
    public void register(Person person) {
        personRepo.insert(person);
    }

    @Transactional
    public void update(Person person) {
        personRepo.update(person);
    }

    public Person findOne(Long id) {
        return personRepo.selectOne(id);
    }

    public List<Person> findAll() {
        return personRepo.selectAll();
    }
}
