package homework26.util;

import homework26.model.Client;
import homework26.model.ClientPhone;
import homework26.model.ClientProAccount;
import homework26.model.Status;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {

                Properties properties = new Properties();
                Configuration configuration = new Configuration().addProperties(properties);
                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(ClientPhone.class);
                configuration.addAnnotatedClass(ClientProAccount.class);
                configuration.addAnnotatedClass(Status.class);

                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Session factory Error: " + e);
            }
        }
        return sessionFactory;
    }

}
