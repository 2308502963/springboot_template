package cn.fzkj.projects.tool.page;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;

/** 封装分页的基类. */
public class PageForm<T extends PageForm<?>> {

    /** 当前页. */
    @Min(value = 1, message = "页码输入有误")
    private Integer current;
    /** 每页显示数量. */
    @Range(min = 1, max = 20, message = "每页显示的数量输入有误")
    private Integer size;

    /** 计算当前页. */
    public T calCurrent(){
        current = (current - 1) * size;
        return (T) this;
    }
}
