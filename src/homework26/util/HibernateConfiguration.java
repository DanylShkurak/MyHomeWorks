package homework26.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {
    private static SessionFactory sessionFactory;


    public static SessionFactory getSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
             sessionFactory = configuration.buildSessionFactory();

        } catch (Exception e) {
            System.err.println("Session factory err " + e);
        }
        return sessionFactory;

    }

}
