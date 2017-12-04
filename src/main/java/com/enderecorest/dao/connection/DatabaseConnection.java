package com.enderecorest.dao.connection;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Williamsena
 */

public final class DatabaseConnection implements Serializable {

    private static final String PU = "enderecorestPU";
    private static DatabaseConnection instance;
    private final EntityManagerFactory factory;
    private EntityManager entityManager;

    private DatabaseConnection() {
        factory = Persistence.createEntityManagerFactory(PU);
    }

    public static synchronized DatabaseConnection newInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public EntityManager getEntityManager() {
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }
}
