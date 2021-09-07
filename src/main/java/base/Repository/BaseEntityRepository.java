package base.Repository;

import base.domain.BaseEntity;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public interface BaseEntityRepository<E extends BaseEntity<ID>, ID extends Serializable> {

    E save(E e);

    E update(E e);

    void delete(E e);

    List<E> findAll();

    E findById(ID id);

    EntityManager getEntityManager();
}