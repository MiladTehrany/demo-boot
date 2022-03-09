package com.tehrany.demoboot.model.repository;

import com.tehrany.demoboot.model.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepo {
    @Autowired
    private BaseRepo<Person, Long> repository;

    public void insert(Person person) {
        repository.insert(person);
    }

    public void update(Person person) {
        repository.update(person);
    }

    public Person selectOne(Long id) {
        return repository.selectOne(Person.class, id);
    }

    public List<Person> selectAll() {
        return repository.selectAll(Person.class);
    }

}
