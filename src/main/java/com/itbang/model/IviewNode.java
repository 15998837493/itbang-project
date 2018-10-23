package com.itbang.model;

import java.util.List;

/**
 * iview tree 结点数据类型
 *
 * @author zj
 * @version 1.0 
 *
 * 变更履历：
 *   v1.0 2018年7月26日 zj 初版
 */
public class IviewNode {
    
    private String title;
    
    private boolean expand;
    
    private boolean check;
    
    private String id;
    
    private List<IviewNode> children;
    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public boolean isExpand() {
        return expand;
    }

    
    public void setExpand(boolean expand) {
        this.expand = expand;
    }

    
    public List<IviewNode> getChildren() {
        return children;
    }

    
    public void setChildren(List<IviewNode> children) {
        this.children = children;
    }


    
    public boolean isCheck() {
        return check;
    }


    
    public void setCheck(boolean check) {
        this.check = check;
    }


    
    public String getId() {
        return id;
    }


    
    public void setId(String id) {
        this.id = id;
    }
    
    

}
