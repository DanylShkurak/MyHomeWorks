package homework26.service;

import homework26.dao.ClientDao;
import homework26.entity.Client;

import java.util.List;

public class ClientService {
    private ClientDao clientDao = new ClientDao();

    public void save(Client client) {
        clientDao.save(client);
    }

    public Client getById(int id) {
        Client client = clientDao.getById(id);
        return client;
    }

    public void updateAgeById(int id, int age) {
        clientDao.updateAgeById(id, age);
    }

    public void deleteById(int id) {
        clientDao.deleteById(id);
    }

    public List<Client> getAll() {
        List<Client> clients = clientDao.getAll();
        return clients;
    }

    public Client getByPhone(int phone) {
        return clientDao.getByPhone(phone);
    }
}
