package com.binus.arya.springdasar.controller;

import com.binus.arya.springdasar.entities.CarEntity;
import com.binus.arya.springdasar.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/car")
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping(value = "checkAPI")
    public String checkApi() {
        return "Hello My Self";
    }
    @PostMapping(value = "addNewCar")
    public CarEntity addNewCar(@RequestBody CarEntity param){
        carRepository.save(param);
        return param;
    }
}
