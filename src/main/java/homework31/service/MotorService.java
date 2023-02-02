package homework31.service;

import homework31.entity.Motor;

public class MotorService {


    public String getModelById(int id) {
        if (id % 2 == 0) {
            return "Toyota";
        }
         return "Lexus";

    }

}
