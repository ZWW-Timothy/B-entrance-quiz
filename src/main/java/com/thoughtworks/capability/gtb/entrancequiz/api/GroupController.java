package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.service.GroupService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GroupController {

    private GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping("/groupList")
    // TODO GTB-知识点: - 没有使用泛型
    public ResponseEntity getGroupResult() {
        return ResponseEntity.ok().build();
    }

    // TODO
//    @GetMapping("/groupList")
//    public ResponseEntity getGroupList() {
//        return ResponseEntity.ok(groupService.getGroupList());
//    }

}
