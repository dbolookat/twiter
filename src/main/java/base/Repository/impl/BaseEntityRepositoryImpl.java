package base.Repository.impl;

import base.Repository.BaseEntityRepository;
import base.domain.BaseEntity;
import javax.persistence.EntityManager;
import java.io.Serializable;

public abstract class BaseEntityRepositoryImpl<E extends BaseEntity<ID>, ID extends Serializable>
        implements BaseEntityRepository<E, ID> {

    protected EntityManager entityManager;

    public BaseEntityRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public abstract Class<E> getEntityClass();


}