package homework26.dao;


import homework26.entity.Status;
import homework26.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class StatusDao {
    public void save(Status status) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(status);

        transaction.commit();
        session.close();
    }

    public List<Status> getAll() {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        final List<Status> statuses = session.createQuery("from Status ").list();

        transaction.commit();
        session.close();

        return statuses;
    }

    public Status getById(int id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Status status = session.get(Status.class, id);

        transaction.commit();
        session.close();

        return status;
    }

    public void updateDescriptionById(int id, String description) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Status status = session.get(Status.class, id);
        status.setDescription(description);
        session.save(status);

        transaction.commit();
        session.close();
    }

    public void deleteById(int id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Status status = session.get(Status.class, id);
        session.delete(status);

        transaction.commit();
        session.close();
    }
}
