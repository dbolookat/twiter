package Repository.impl;

import Service.impl.UserServiceImpl;
import domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserRepositoryImplTest {
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
    void findByUser(String u) {
        userRepository.findByUser("user");
    }

    @Test
    void save() {
        userRepository.save(user);
    }
}