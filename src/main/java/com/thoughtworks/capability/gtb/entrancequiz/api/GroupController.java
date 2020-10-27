package com.thoughtworks.capability.gtb.entrancequiz.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GroupController {

    @GetMapping("/groupList")
    @ResponseBody
    public ResponseEntity getGroupResult() {
        return ResponseEntity.ok().build();
    }
}
