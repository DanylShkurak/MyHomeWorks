package homework26.service;

import homework26.dao.AccountDao;
import homework26.entity.Account;
import org.apache.log4j.Logger;


import java.util.List;

public class AccountService {
    Logger logger = Logger.getLogger(AccountService.class.getName());
    private final AccountDao accountDao = new AccountDao();

    public void save(Account account) {
        accountDao.save(account);
    }

    public Account getById(int id) {
        Account account = accountDao.getById(id);
        logger.debug(String.format("Account value is {%s} for id {%d}",account.getValue(),account.getId()));
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
