package homework26.dao;


import homework26.entity.Account;
import homework26.util.HibernateConfiguration;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;


public class AccountDao {
    Logger logger = Logger.getLogger(AccountDao.class.getName());

    public void save(Account account) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(account);

        transaction.commit();
        session.close();
    }

    public List<Account> getAll() {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        final List<Account> accounts = session.createQuery("from Account ").list();

        transaction.commit();
        session.close();

        return accounts;
    }

    public Account getById(int id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Account account = session.get(Account.class, id);
        logger.debug(String.format("Phone number is {%s} for id {%d}",account.getNumber(),account.getId()));
        transaction.commit();
        session.close();

        return account;
    }

    public void updateValueById(int id, double value) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Account account = session.get(Account.class, id);
        account.setValue(value);
        session.save(account);

        transaction.commit();
        session.close();
    }

    public void deleteById(int id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Account account = session.get(Account.class, id);
        session.delete(account);

        transaction.commit();
        session.close();
    }
}
