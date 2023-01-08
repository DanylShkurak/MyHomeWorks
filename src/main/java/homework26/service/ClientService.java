package homework26.service;

import homework26.dao.ClientDao;
import homework26.model.Client;
import homework26.model.ClientPhone;

import java.util.List;

public class ClientService {
    ClientDao clientDao = new ClientDao();


    public void save(Client client){
        clientDao.save(client);
    }

}
