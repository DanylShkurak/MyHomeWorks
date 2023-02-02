package homework31.service;

import homework31.entity.Car;
import org.apache.log4j.Logger;

public class CarService {

    public CarService(MotorService motorService) {
        this.motorService = motorService;
    }

    private MotorService motorService;
    public Car save(int id, int yearOfManufacture ){
        MotorService motorService = new MotorService();
        String modelById = motorService.getModelById(id);
        return new Car(id,modelById,yearOfManufacture);
    }
}
