package homework24;

import homework24.entity.Account;
import homework24.entity.Client;
import homework24.service.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        List<Client> byPhone = clientService.getByPhone(90721264);
        byPhone.forEach(System.out::println);


        AccountService accountService = new AccountService();
        List<Account> byValue = accountService.getByValue(21313.3);
        byValue.forEach(System.out::println);


        List<Account> allAccounts = accountService.getAll();
        List<Client> byId = clientService.getById(allAccounts.get(2).getClientID());
        byId.forEach(System.out::println);
//        можно и просто передать значение
//        List<Client> byIdA = clientService.getById(3);

        ClientAccessLevelService clientAccessLevelService = new ClientAccessLevelService();
        clientAccessLevelService.getByAge(18).forEach(System.out::println);
    }
}
