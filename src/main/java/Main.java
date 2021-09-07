import util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= HibernateUtil.getEntityMangerFactory();
        EntityManager entityManager=entityManagerFactory.createEntityManager();
    }
}
