package homework26;

import homework26.model.Client;
import homework26.model.ClientPhone;
import homework26.model.ClientProAccount;
import homework26.model.Status;
import homework26.service.ClientPhoneService;
import homework26.service.ClientService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ClientPhoneService clientPhoneService = new ClientPhoneService();
        ClientPhone clientPhone = new ClientPhone();
        clientPhone.setPhoneModel("samsung");
        clientPhone.setYearOfManufacture(2020);
        clientPhone.setPrice(1500);

        Set<Status> statuses = new HashSet<>();
         Status status = new Status();
        status.setAlias("User");
        status.setDescription("access lvl for users");
        statuses.add(status);

        ClientService clientService = new ClientService();
        Client client = new Client();
        client.setName("John");
        client.setEmail("John1@mail.com");
        client.setAge(43);
        client.setPhone(875232131);
        client.setAbout("smth about John");

        ClientProAccount clientProAccount = new ClientProAccount();
        clientProAccount.setNickname("noobik");
        clientProAccount.setRatingInElo(1234);
        client.setStatuses(new HashSet<>());
        client.setClientProAccount(clientProAccount);
        clientPhone.setClient(client);
        clientPhoneService.save(clientPhone);


    }
}

