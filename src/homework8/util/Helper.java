package homework8.util;

import homework8.exception.UserExpectedError;
import homework8.exception.WrongFieldException;
import homework8.exception.WrongSumException;

public  class Helper {
    public void checkClientAccId(String clientAccID) throws WrongFieldException {
        if (!clientAccID.equals(String.valueOf(10))) {
            throw new WrongFieldException();
        }
    }
    public void checkSum(float sum) throws WrongSumException {
        if(sum>1000){
            throw new WrongSumException();
        }
    }
    public void compareClientsAccId(String clientAccIdWhoSend, String clientAccWhoReceive) throws UserExpectedError {
        if(!clientAccWhoReceive.equals(clientAccIdWhoSend)){
            throw new UserExpectedError();
        }
    }
}
