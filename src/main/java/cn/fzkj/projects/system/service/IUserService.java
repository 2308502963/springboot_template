package cn.fzkj.projects.system.service;

import cn.fzkj.projects.system.domain.User;
import cn.fzkj.projects.system.dto.UserForm;

import java.util.List;

public interface IUserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    User addUser(User user);

}
