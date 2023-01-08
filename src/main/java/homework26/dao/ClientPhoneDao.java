package homework26.dao;

import homework26.model.ClientPhone;
import homework26.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientPhoneDao {
    public void save (ClientPhone clientPhone){
        SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(clientPhone);
        transaction.commit();
        session.close();
    }
}
