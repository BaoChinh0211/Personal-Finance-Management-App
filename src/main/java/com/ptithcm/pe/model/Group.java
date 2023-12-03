/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.model;

/**
 *
 * @author tezca
 */
public class Group {
    private int groupId;
    private String groupName;
    private boolean type;
    private int userId;

    public Group() {
    }

    public Group(String groupName, boolean type, int userId) {
        this.groupName = groupName;
        this.type = type;
        this.userId = userId;
    }

    public Group(int groupId, String groupName, boolean type, int userId) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.type = type;
        this.userId = userId;
    }
    
    

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Group{" + "groupId=" + groupId + ", groupName=" + groupName + ", type=" + type + ", userId=" + userId + '}';
    }    
    
}
