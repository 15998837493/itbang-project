package com.itbang.entity.system;

import java.io.Serializable;
import java.util.Date;

public class SysResource implements Serializable {
    private String resourceId;

    private String resourceName;

    private String resourceUrl;

    private Integer resourceType;

    private Integer resourceOrder;

    private String resourceParent;

    private String resourceRemark;

    private Date createTime;

    private Date updateTime;

    private Integer flag;

    private String createUserId;

    private String updateUserId;

    private String createInsId;

    private static final long serialVersionUID = 1L;

    public SysResource(String resourceId, String resourceName, String resourceUrl, Integer resourceType, Integer resourceOrder, String resourceParent, String resourceRemark, Date createTime, Date updateTime, Integer flag, String createUserId, String updateUserId, String createInsId) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceUrl = resourceUrl;
        this.resourceType = resourceType;
        this.resourceOrder = resourceOrder;
        this.resourceParent = resourceParent;
        this.resourceRemark = resourceRemark;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.flag = flag;
        this.createUserId = createUserId;
        this.updateUserId = updateUserId;
        this.createInsId = createInsId;
    }

    public SysResource() {
        super();
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public Integer getResourceOrder() {
        return resourceOrder;
    }

    public void setResourceOrder(Integer resourceOrder) {
        this.resourceOrder = resourceOrder;
    }

    public String getResourceParent() {
        return resourceParent;
    }

    public void setResourceParent(String resourceParent) {
        this.resourceParent = resourceParent == null ? null : resourceParent.trim();
    }

    public String getResourceRemark() {
        return resourceRemark;
    }

    public void setResourceRemark(String resourceRemark) {
        this.resourceRemark = resourceRemark == null ? null : resourceRemark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    public String getCreateInsId() {
        return createInsId;
    }

    public void setCreateInsId(String createInsId) {
        this.createInsId = createInsId == null ? null : createInsId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resourceId=").append(resourceId);
        sb.append(", resourceName=").append(resourceName);
        sb.append(", resourceUrl=").append(resourceUrl);
        sb.append(", resourceType=").append(resourceType);
        sb.append(", resourceOrder=").append(resourceOrder);
        sb.append(", resourceParent=").append(resourceParent);
        sb.append(", resourceRemark=").append(resourceRemark);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", flag=").append(flag);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", createInsId=").append(createInsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
