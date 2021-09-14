package Service.impl;

import Repository.impl.TwitRepositoryImpl;
import domain.Twit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class TwitServiceImplTest {
    private Twit twit;
    private TwitServiceImpl twitService;


    @BeforeEach
    public void init() {
        List list=new ArrayList();
        twit=mock(Twit.class);
        when(twit.getUser_id()).thenReturn(1l);
        twitService=mock(TwitServiceImpl.class);
        when(twitService.findAll()).thenReturn(list);
    }

    @Test
    void save() {
        twitService.save(twit);
    }

    @Test
    void findAll() {
        twitService.findAll();

    }
}