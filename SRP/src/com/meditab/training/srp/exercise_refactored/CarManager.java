package com.meditab.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{

    public Car getFromDb(final String carId)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }



    
}
