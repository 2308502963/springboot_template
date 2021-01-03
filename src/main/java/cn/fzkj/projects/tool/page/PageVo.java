package cn.fzkj.projects.tool.page;

import org.springframework.beans.BeanUtils;

import java.util.List;

public class PageVo<T> {

    /** 分页数据. */
    private List<T> records;
    /** 总条数. */
    private Integer total;
    /** 总页数. */
    private Integer pages;
    /** 当前页. */
    private Integer current;
    /** 查询数量. */
    private Integer size;

    /**
     * 设置当前页和每页显示数据.
     * @param pageForm 分页表单
     * @return
     */
    public PageVo<T> setCurrentAndSize(PageForm<?> pageForm){
        BeanUtils.copyProperties(pageForm, this);
        return this;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
        this.setPages(this.total % this.size > 0 ? this.total / this.size + 1 : this.total / this.size);
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
