package domain;

import base.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Like extends BaseEntity<Long> {
    private boolean isLiked;

}
