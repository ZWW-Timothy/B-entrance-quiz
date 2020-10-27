package com.thoughtworks.capability.gtb.entrancequiz.dto;

public class MemberDto {

    private Integer memberId;
    private String memberName;

    public MemberDto(int id, String name) {
        this.memberId = id;
        this.memberName = name;
    }

    public Integer getMemberId() {
        return this.memberId;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public void setMemberId(Integer id) {
        this.memberId = id;
    }

    public void setMemberName(String name) {
        this.memberName = name;
    }
}
