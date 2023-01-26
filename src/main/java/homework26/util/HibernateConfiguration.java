package homework26.util;


import homework26.entity.Account;
import homework26.entity.Client;
import homework26.entity.Status;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {
    private static SessionFactory sessionFactory;
    static Logger  logger = Logger.getLogger(HibernateConfiguration.class.getName());

    public static SessionFactory getSessionFactory() {
        {
            if (sessionFactory == null) {
                try {
                    Configuration configuration = new Configuration().configure();
                    configuration.addAnnotatedClass(Client.class);
                    configuration.addAnnotatedClass(Status.class);
                    configuration.addAnnotatedClass(Account.class);
                    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                    sessionFactory = configuration.buildSessionFactory(builder.build());

                } catch (Exception e) {
                    logger.error(String.format("Fail in connection to db with %s ",e));
                }
            }
            return sessionFactory;
        }

}}
