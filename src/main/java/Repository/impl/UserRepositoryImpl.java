package Repository.impl;

import Repository.UserRepository;
import base.Repository.impl.BaseEntityRepositoryImpl;
import domain.User;

import javax.persistence.EntityManager;
import java.util.List;

public class UserRepositoryImpl extends BaseEntityRepositoryImpl<User,Long> implements UserRepository {

    public UserRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
        this.entityManager=entityManager;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long aLong) {
        return null;
    }

    @Override
    public EntityManager getEntityManager() {
        return null;
    }

    @Override
    public Class<User> getEntityClass() {
        return null;
    }
}
