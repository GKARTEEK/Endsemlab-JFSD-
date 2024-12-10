package com.klef.jfsd.exam.ENDSEM_LAB;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DeviceDAOImpl implements DeviceDAO {
    private SessionFactory sessionFactory;

    public DeviceDAOImpl() {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Device.class)
                .buildSessionFactory();
    }

    @Override
    public void addDevice(Device device) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(device);
        transaction.commit();
        session.close();
    }
}
