package cn.fzkj.projects.system.domain;

import com.baomidou.mybatisplus.annotation.*;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/** 【示例】实体类. */
public class User {

    /** 主键. */
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 姓名 */
    private String name;

    /** email. */
    private String email;

    /** 年龄. */
    private Integer age;

    /** 创建时间. */
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    /** 更新时间. */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;

    /** 版本. */
    @Version
    @TableField(select = false) // 查询时不显示此字段
    private Integer version;

    /** 逻辑删除 */
    @TableLogic
    @TableField(select = false) // 查询时不显示此字段
    private Integer deleted;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", version=" + version +
                ", deleted=" + deleted +
                '}';
    }

    public Long getuId() {
        return id;
    }

    public void setuId(Long id) {
        this.id = id;
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

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

}
