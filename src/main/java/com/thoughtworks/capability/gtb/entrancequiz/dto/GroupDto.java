package com.thoughtworks.capability.gtb.entrancequiz.dto;

public class GroupDto {
    private Integer groupId;
    private String groupName;

    public GroupDto(int id, String name) {
        this.groupId = id;
        this.groupName = name;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupId(Integer id) {
        this.groupId = id;
    }

    public void setGroupName(String name) {
        this.groupName = name;
    }
}
