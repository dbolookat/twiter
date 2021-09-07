package Repository.impl;

import Repository.TwitRepository;
import base.Repository.impl.BaseEntityRepositoryImpl;
import domain.Twit;

import javax.persistence.EntityManager;
import java.util.List;

public class TwitRepositoryImpl extends BaseEntityRepositoryImpl<Twit , Long> implements TwitRepository {

    public TwitRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
        this.entityManager=entityManager;
    }

    @Override
    public Twit save(Twit twit) {
        return null;
    }

    @Override
    public Twit update(Twit twit) {
        return null;
    }

    @Override
    public void delete(Twit twit) {

    }

    @Override
    public List<Twit> findAll() {
        return null;
    }

    @Override
    public Twit findById(Long aLong) {
        return null;
    }

    @Override
    public EntityManager getEntityManager() {
        return null;
    }

    @Override
    public Class<Twit> getEntityClass() {
        return null;
    }
}
