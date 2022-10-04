package homework8.service;

import homework8.entity.Client;
import homework8.util.Helper;

public class TransactionService {
    public void transferOfMoney(Client client, String clientAccId){
        Helper helper = new Helper();
        helper.compareClientsAccId(client.getClientAccID(),clientAccId);
    }
}