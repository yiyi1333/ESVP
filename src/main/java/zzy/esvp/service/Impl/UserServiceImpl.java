package zzy.esvp.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zzy.esvp.dao.UserDao;
import zzy.esvp.dao.UserMapper;
import zzy.esvp.eneity.User;
import zzy.esvp.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAllById(1);
    }
}
