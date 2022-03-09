package com.tehrany.demoboot.model.repository;

import com.tehrany.demoboot.model.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepo {
    @Autowired
    private BaseRepo<Car, Long> repository;

    public void insert(Car car) {
        repository.insert(car);
    }

    public void update(Car car) {
        repository.update(car);
    }

    public Car selectOne(Long id) {
        return repository.selectOne(Car.class, id);
    }

    public List<Car> selectAll() {
        return repository.selectAll(Car.class);
    }
}
