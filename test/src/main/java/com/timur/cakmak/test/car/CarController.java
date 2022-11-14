package com.timur.cakmak.test.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("/")
    public List<Car> getAll() {
        return carService.getAll();
    }
}
