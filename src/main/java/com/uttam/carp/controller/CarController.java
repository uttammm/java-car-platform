package com.uttam.carp.controller;

import com.uttam.carp.model.Car;
import com.uttam.carp.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    private CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getCars(){
        return carService.getAllCars();
    }

    @GetMapping("/cars/{id}")
    public Car getCarbyId(@PathVariable int id){
        return carService.getCarbyId(id);
    }

    @PostMapping("/cars")
    public Car addCar(@RequestBody Car car){
        return carService.addCar(car);
    }

    @PutMapping("/cars/{id}")
    public Car updateCar(@PathVariable int id, @RequestBody Car car){
        return carService.updateCar(id, car);
    }

    @DeleteMapping("/cars/{id}")
    public String deleteCar(@PathVariable int id){
        return carService.removeCar(id);
    }
}
