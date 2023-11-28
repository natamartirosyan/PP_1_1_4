package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.Table;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    Configuration config = new Configuration().addAnnotatedClass(User.class);
    SessionFactory sessionFactory = config.buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();

    @Override
    public void createUsersTable() {
        try {
            session.beginTransaction();

            Table table = new Table("User");
            session.save(table);

            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }

    @Override
    public void dropUsersTable() {

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        try {
            session.beginTransaction();

            User user = new User(name, lastName, age);

            session.save(user);

            session.getTransaction().commit();
        }
        finally {
            sessionFactory.close();
        }
    }

    @Override
    public void removeUserById(long id) {
        try {
            session.beginTransaction();

            User user = session.get(User.class, id);

            session.delete(user);

            session.getTransaction().commit();
        }
        finally {
            sessionFactory.close();
        }
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void cleanUsersTable() {

    }
}
