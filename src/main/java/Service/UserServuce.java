package Service;

import base.Service.BaseEntityService;
import domain.User;

import java.util.List;

public interface UserServuce extends BaseEntityService<User , Long> {
    @Override
    User save(User user);

    @Override
    User update(User user);

    @Override
    List<User> findAll();

    @Override
    User findById(Long aLong);

    @Override
    void delete(User user);
}
