package com.gioov.oryx.common.vue.antd;

import java.io.Serializable;
import java.util.Date;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2018-02-22
 */
public class ViewPageEntityAsAntdTable implements Serializable {
    private static final long serialVersionUID = 4491751521280263455L;

    /**
     * id
     */
    private Long id;

    /**
     * 页面名称
     */
    private String name;

    /**
     * 请求地址（url）
     */
    private String url;

    /**
     * 权限（authority）
     */
    private String authority;

    /**
     * 页面分类 id
     */
    private Long viewPageCategoryId;

    /**
     * 排序
     */
    private Long sort;

    /**
     * 备注
     */
    private String remark;

    /**
     * 更新时间
     */
    private Date gmtModified;

    /**
     * 创建时间
     */
    private Date gmtCreated;

    private Integer isGranted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Long getViewPageCategoryId() {
        return viewPageCategoryId;
    }

    public void setViewPageCategoryId(Long viewPageCategoryId) {
        this.viewPageCategoryId = viewPageCategoryId;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Integer getIsGranted() {
        return isGranted;
    }

    public void setIsGranted(Integer isGranted) {
        this.isGranted = isGranted;
    }
}
