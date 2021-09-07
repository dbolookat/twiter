package Repository.impl;

import Repository.CommentRepository;
import base.Repository.impl.BaseEntityRepositoryImpl;
import domain.Comment;

import javax.persistence.EntityManager;
import java.util.List;

public class CommentRepositoryImpl extends BaseEntityRepositoryImpl<Comment,Long> implements CommentRepository {

    public CommentRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
       this.entityManager=entityManager;
    }

    @Override
    public Class<Comment> getEntityClass() {
        return null;
    }

    @Override
    public Comment save(Comment comment) {
        return null;
    }

    @Override
    public Comment update(Comment comment) {
        return null;
    }

    @Override
    public void delete(Comment comment) {

    }

    @Override
    public List<Comment> findAll() {
        return null;
    }

    @Override
    public Comment findById(Long aLong) {
        return null;
    }

    @Override
    public EntityManager getEntityManager() {
        return null;
    }
}
