package homework26.dao;

import homework26.entity.Client;
import homework26.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


public class ClientDao {
    public void save(Client client) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(client);

        transaction.commit();
        session.close();
    }
    public List<Client> getAll(){
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        final List<Client> clients = session.createQuery("from Client ").list();

        transaction.commit();
        session.close();

        return clients;
    }
    public Client getById(int id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Client client = session.get(Client.class, id);

        transaction.commit();
        session.close();

        return client;
    }

    public void updateAgeById(int id, int age) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Client client = session.get(Client.class, id);
        client.setAge(age);
        session.save(client);

        transaction.commit();
        session.close();
    }

    public void deleteById(int id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Client client = session.get(Client.class, id);
        session.delete(client);

        transaction.commit();
        session.close();
    }
    public Client getByPhone(int phone){
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Client where phone=:phone");
        query.setParameter("phone",phone);
        Client client = (Client) query.uniqueResult();
        transaction.commit();
        session.close();

        return client;
    }

}
