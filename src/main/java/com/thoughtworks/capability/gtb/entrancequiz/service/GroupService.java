package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.dto.GroupDto;
import com.thoughtworks.capability.gtb.entrancequiz.repository.GroupRepository;
import com.thoughtworks.capability.gtb.entrancequiz.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    private MemberRepository memberRepository;
    private GroupRepository groupRepository;

    public GroupService(MemberRepository memberRepository, GroupRepository groupRepository) {
        this.memberRepository = memberRepository;
        this.groupRepository = groupRepository;
    }

    public List<GroupDto> getGroupList() {
        return null;
    }
}
