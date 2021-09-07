package Service;

import base.Service.BaseEntityService;
import domain.Twit;

import java.util.List;

public interface TwitService extends BaseEntityService<Twit,Long> {
    @Override
    Twit save(Twit twit);

    @Override
    Twit update(Twit twit);

    @Override
    List<Twit> findAll();

    @Override
    Twit findById(Long aLong);

    @Override
    void delete(Twit twit);
}
