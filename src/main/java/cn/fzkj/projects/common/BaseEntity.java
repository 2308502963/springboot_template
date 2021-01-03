package cn.fzkj.projects.common;

/** 定义抽象实体基类. */
public abstract class BaseEntity<T> {
    /**
     * 获取实例
     * @return 返回实体类
     */
    public abstract T buildEntity();
}
