package homework26.dao;

import homework26.model.Client;
import homework26.model.ClientPhone;
import homework26.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ClientDao {

    public void save (Client client){
        SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(client);
        transaction.commit();
        session.close();
    }

}
