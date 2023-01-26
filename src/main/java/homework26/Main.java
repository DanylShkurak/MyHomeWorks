package homework26;

import homework26.entity.Client;
import homework26.entity.Status;
import homework26.service.AccountService;
import homework26.service.ClientService;
import homework26.service.StatusService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        Client client = new Client();
//        client.setName("volodya");
//        client.setEmail("volodich@gmail.com");
//        client.setPhone(90315091);
//        client.setAbout("just volodya");
//        clientService.save(client);
//        Client byId = clientService.getById(5);
//        System.out.println(byId);
//        System.out.println(clientService.getByPhone(90722099));
//        clientService.updateAgeById(5,59);
//        clientService.deleteById(12);
//        StatusService statusService = new StatusService();
//        Status status = new Status();
//        System.out.println(statusService.getAll());
//        System.out.println(statusService.getById(1));
        AccountService accountService = new AccountService();

        System.out.println(accountService.getById(3));
    }
}
