package homework26.service;

import homework26.dao.ClientPhoneDao;
import homework26.model.ClientPhone;

public class ClientPhoneService {
    ClientPhoneDao clientPhoneDao = new ClientPhoneDao();
    public void save(ClientPhone clientPhone){
        clientPhoneDao.save(clientPhone);
    }
}
