package homework26.service;

import homework26.dao.AccountDao;
import homework26.entity.Account;


import java.util.List;

public class AccountService {
    private final AccountDao accountDao = new AccountDao();

    public void save(Account account) {
        accountDao.save(account);
    }

    public Account getById(int id) {
        Account account = accountDao.getById(id);
        return account;
    }

    public void updateValueById(int id, double value) {
        accountDao.updateValueById(id, value);
    }

    public void deleteById(int id) {
        accountDao.deleteById(id);
    }

    public List<Account> getAll() {
        List<Account> accounts = accountDao.getAll();
        return accounts;
    }
}
