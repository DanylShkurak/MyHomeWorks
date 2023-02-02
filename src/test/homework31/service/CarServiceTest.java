package homework31.service;

import homework31.entity.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class CarServiceTest {
    private CarService carService;
    private MotorService motorService;

    @BeforeEach
    void setUp() {
        motorService = mock(MotorService.class);
        carService = new CarService(motorService);
    }

    @Test
    void saveIfIdIsOddNumberTest() {
        Car car = carService.save(1, 2002);
        assertNotNull(car, "car is not null");
        assertEquals(car.getMotorModel(), "Lexus");
        assertEquals(car.getYearOfManufacture(), 2002);
        assertEquals(car.getId(), 1);

    }

    @Test
    void saveIfIdIsEvenNumberTest() {
        Car car = carService.save(2, 2022);
        assertNotNull(car, "car is  null");
        assertEquals(car.getMotorModel(), "Toyota");
        assertEquals(car.getYearOfManufacture(), 2022);
        assertEquals(car.getId(), 2);
    }


}