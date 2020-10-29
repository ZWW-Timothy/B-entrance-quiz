package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.dto.MemberDto;
import com.thoughtworks.capability.gtb.entrancequiz.service.MemberService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class MemberController {

    // TODO GTB-知识点: - 构造注入的字段推荐使用final
    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // TODO GTB-知识点: - 违反Restful实践, url不合理
    @GetMapping("/memberList")
    public ResponseEntity<List<MemberDto>> getMemberList() {
        return ResponseEntity.ok(memberService.getMemberList());
    }
}
