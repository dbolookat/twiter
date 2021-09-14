package Service.impl;

import Repository.impl.UserRepositoryImpl;
import domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserServiceImplTest {
    private User user;
    private UserRepositoryImpl userRepository;
    private UserServiceImpl service;

    @BeforeEach
    public void init() {
        user = mock(User.class);
        when(user.getPassword()).thenReturn("password");
        userRepository = mock(UserRepositoryImpl.class);
        when(userRepository.findByUser(anyString())).thenReturn(user);
    }

    @Test
    void save() {
    }

    @Test
    void login() {
        user=userRepository.findByUser("user");
        if(user!=null && user.getPassword().equals("password"));

    }
}