package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.dto.MemberDto;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberRepository {

    private List<MemberDto> memberList = new ArrayList<MemberDto>() {
        {
            add(new MemberDto(1, "成吉思汗"));
            add(new MemberDto(2, "鲁班七号"));
            add(new MemberDto(3, "太乙真人"));
            add(new MemberDto(4, "钟无艳"));
            add(new MemberDto(5, "花木兰"));
            add(new MemberDto(6, "雅典娜"));
            add(new MemberDto(7, "芈月"));
            add(new MemberDto(8, "白起"));
            add(new MemberDto(9, "刘禅"));
            add(new MemberDto(10, "庄周"));
            add(new MemberDto(11, "马超"));
            add(new MemberDto(12, "刘备"));
            add(new MemberDto(13, "哪吒"));
            add(new MemberDto(14, "大乔"));
            add(new MemberDto(15, "蔡文姬"));
        }
    };

    public List<MemberDto> getMemberList() {
        return memberList;
    }
}
