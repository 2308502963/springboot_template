package cn.fzkj.projects.system.controller;

import cn.fzkj.common.ResultVo;
import cn.fzkj.projects.system.domain.User;
import cn.fzkj.projects.system.dto.UserForm;
import cn.fzkj.projects.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("getAllUsers")
    public ResultVo getAllUsers(){
        List<User> allUsers = userService.getAllUsers();
        return ResultVo.okData(allUsers);
    }

    @RequestMapping("getUser")
    public ResultVo getUser(Long id){
        User userById = userService.getUserById(id);
        return ResultVo.okData(userById);
    }

    @RequestMapping("addUser")
    public ResultVo addUser(@RequestBody UserForm userForm){
        User user = userService.addUser(userForm.buildEntity());
        return null == user ? ResultVo.fail() : ResultVo.okData(user);
    }

}
