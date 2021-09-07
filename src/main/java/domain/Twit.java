package domain;

import base.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Twit extends BaseEntity<Long> {
    private String twit;


    @OneToMany
    private List<Like> likeList = new ArrayList<>();

    @OneToMany
    private List<Comment> commentList=new ArrayList<>();

    public Twit() {
    }

    public String getTwit() {
        return twit;
    }

    public List<Like> getLikeList() {
        return likeList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setTwit(String twit) {
        this.twit = twit;
    }

    public void setLikeList(List<Like> likeList) {
        this.likeList = likeList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
