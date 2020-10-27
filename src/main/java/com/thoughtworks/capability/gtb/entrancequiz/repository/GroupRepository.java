package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.dto.GroupDto;
import com.thoughtworks.capability.gtb.entrancequiz.dto.MemberDto;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GroupRepository {

    private List<MemberDto> memberList = new ArrayList<MemberDto>();

    public void setMemberList(List<MemberDto> memberListInput) {
        memberList = memberListInput;
    }

    public List<GroupDto> getGroupList() {
        return null;
    }
}
