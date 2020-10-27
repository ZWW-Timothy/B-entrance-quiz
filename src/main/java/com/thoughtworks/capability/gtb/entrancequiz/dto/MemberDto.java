package com.thoughtworks.capability.gtb.entrancequiz.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class MemberDto {

    private Integer MemberId;
    private String MemberName;

    public MemberDto(int id, String name) {
        this.MemberId = id;
        this.MemberName = name;
    }

    public Integer getMemberId() {
        return this.MemberId;
    }

    public String getMemberName() {
        return this.MemberName;
    }

    public void setMemberId(Integer id) {
        this.MemberId = id;
    }

    public void setMemberName(String name) {
        this.MemberName = name;
    }
}
