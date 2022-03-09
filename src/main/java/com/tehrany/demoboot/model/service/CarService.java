package com.tehrany.demoboot.model.service;

import com.tehrany.demoboot.model.entity.Car;
import com.tehrany.demoboot.model.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepo carRepo;

    @Transactional
    public void save(Car car) {
        carRepo.insert(car);
    }

    @Transactional
    public void update(Car car) {
        carRepo.update(car);
    }

    public Car findOne(Long id) {
        return carRepo.selectOne(id);
    }

    public List<Car> findAll() {
        return carRepo.selectAll();
    }
}
