package Service;

import base.Service.BaseEntityService;
import domain.Like;

import java.util.List;

public interface LikeService extends BaseEntityService<Like , Long> {
    @Override
    Like save(Like like);

    @Override
    Like update(Like like);

    @Override
    List<Like> findAll();

    @Override
    Like findById(Long aLong);

    @Override
    void delete(Like like);
}
