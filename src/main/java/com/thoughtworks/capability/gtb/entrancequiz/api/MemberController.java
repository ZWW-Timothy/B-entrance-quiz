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
    private MemberService memberService;

    @GetMapping("/memberList")
    @ResponseBody
    public ResponseEntity<List<MemberDto>> getMemberList() {
        return ResponseEntity.ok(memberService.getMemberList());
    }
}
