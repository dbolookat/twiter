package Repository.impl;

import Service.impl.TwitServiceImpl;
import domain.Twit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class TwitRepositoryImplTest {
    private Twit twit;
    private TwitRepositoryImpl twitRepository;

    @BeforeEach
    public void init() {
        List list=new ArrayList();
        twit=mock(Twit.class);
        when(twit.getUser_id()).thenReturn(1l);
        twitRepository=mock(TwitRepositoryImpl.class);
        when(twitRepository.findAll()).thenReturn(list);
    }


    @Test
    void save() {
        twitRepository.save(twit);
    }

    @Test
    void findAll() {
        twitRepository.findAll();
    }
}