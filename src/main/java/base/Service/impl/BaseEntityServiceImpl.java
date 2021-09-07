package base.Service.impl;

import base.Repository.BaseEntityRepository;
import base.Service.BaseEntityService;
import base.domain.BaseEntity;

import java.io.Serializable;
import java.util.List;

class BaseEntityServiceImpl<E extends BaseEntity<ID>,
        ID extends Serializable, R extends BaseEntityRepository<E, ID>>
        implements BaseEntityService<E, ID> {

    protected final R repository;

    public BaseEntityServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public E save(E e) {
        return null;
    }

    @Override
    public E update(E e) {
        return null;
    }

    @Override
    public List<E> findAll() {
        return null;
    }

    @Override
    public E findById(ID id) {
        return null;
    }

    @Override
    public void delete(E e) {

    }
}