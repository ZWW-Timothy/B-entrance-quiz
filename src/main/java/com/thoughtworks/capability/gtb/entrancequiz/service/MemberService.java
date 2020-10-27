package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.dto.MemberDto;
import com.thoughtworks.capability.gtb.entrancequiz.repository.MemberRepository;

import java.util.List;

public class MemberService {

    private MemberRepository memberRepository;

    public List<MemberDto> getMemberList() {
        return memberRepository.getMemberList();
    }
}
