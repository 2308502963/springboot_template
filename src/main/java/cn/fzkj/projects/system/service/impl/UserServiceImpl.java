package cn.fzkj.projects.system.service.impl;

import cn.fzkj.projects.system.domain.User;
import cn.fzkj.projects.system.mapper.UserMapper;
import cn.fzkj.projects.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.selectList(null);
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public User addUser(User user) {
        userMapper.insert(user);
        User user1 = userMapper.selectById(user.getuId());
        return user1;
    }
}
