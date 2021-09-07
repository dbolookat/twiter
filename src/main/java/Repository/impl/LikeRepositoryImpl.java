package Repository.impl;

import Repository.LikeRepository;
import base.Repository.impl.BaseEntityRepositoryImpl;
import domain.Like;

import javax.persistence.EntityManager;
import java.util.List;

public class LikeRepositoryImpl extends BaseEntityRepositoryImpl<Like , Long> implements LikeRepository {

    public LikeRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
        this.entityManager=entityManager;
    }

    @Override
    public Like save(Like like) {
        return null;
    }

    @Override
    public Like update(Like like) {
        return null;
    }

    @Override
    public void delete(Like like) {

    }

    @Override
    public List<Like> findAll() {
        return null;
    }

    @Override
    public Like findById(Long aLong) {
        return null;
    }

    @Override
    public EntityManager getEntityManager() {
        return null;
    }

    @Override
    public Class<Like> getEntityClass() {
        return null;
    }
}
