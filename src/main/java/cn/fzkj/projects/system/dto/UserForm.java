package cn.fzkj.projects.system.dto;

import cn.fzkj.projects.common.BaseEntity;
import cn.fzkj.projects.system.domain.User;
import org.springframework.beans.BeanUtils;

/** 前台表单. */
public class UserForm extends BaseEntity<User> {
    /** 姓名 */
    private String name;

    /** email. */
    private String email;

    /** 年龄. */
    private Integer age;

    /**
     * 封装 前台表单到数据库模型的映射
     * @return
     */
    @Override
    public User buildEntity() {
        User user = new User();
        BeanUtils.copyProperties(this, user);
        return user;
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
