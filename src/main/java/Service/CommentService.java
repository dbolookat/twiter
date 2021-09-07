package Service;

import base.Service.BaseEntityService;
import domain.Comment;

import java.util.List;

public interface CommentService extends BaseEntityService<Comment,Long> {
    @Override
    Comment save(Comment comment);

    @Override
    Comment update(Comment comment);

    @Override
    List<Comment> findAll();

    @Override
    Comment findById(Long aLong);

    @Override
    void delete(Comment comment);
}
