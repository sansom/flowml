package com.beautiful.ui.core.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Map;

public class Node implements Serializable {
    @Id
    private String id;

    private String groupId;

    private String name;//节点名字

    private Map<String, String> props;//节点属性

    private String comment;//描述文字

    private Integer sort;//在每一个组里面的顺序

    private Long createTime;

    private Long updateTime;//更新时间

    public Node() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getProps() {
        return props;
    }

    public void setProps(Map<String, String> props) {
        this.props = props;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}