package homework31.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorServiceTest {
    private final MotorService motorService = new MotorService();

    @Test
    void getModelByIdTest() {
        String modelById = motorService.getModelById(2);
        assertNotNull(modelById,"model is null");
        assertEquals("Toyota",modelById);
    }
}