package com.uttam.carp.service;

import com.uttam.carp.model.Car;
import com.uttam.carp.exception.CarNotFoundException;
import com.uttam.carp.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    public Car getCarbyId(int id){
        return carRepository.findById(id).orElseThrow(()->new CarNotFoundException(id));
    }

    public Car addCar(Car car){
        return carRepository.save(car);
    }

    public Car updateCar(int id, Car car){
        Car car1 = carRepository.findById(id).orElseThrow(()->new CarNotFoundException(id));
        car1.setBrand(car.getBrand());
        car1.setModelName(car.getModelName());
        car1.setTopSpeed(car.getTopSpeed());
        return carRepository.save(car1);
    }

    public String removeCar(int id){
        carRepository.deleteById(id);
        return "Car " + id + " deleted";
    }

}
