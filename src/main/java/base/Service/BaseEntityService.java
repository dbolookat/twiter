package base.Service;
import base.domain.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseEntityService<E extends BaseEntity<ID> , ID extends Serializable> {

    E save(E e);

    E update(E e);

    List<E> findAll();

    E findById(ID id);

    void delete(E e);
}