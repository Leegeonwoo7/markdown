package com.bridge.markdown_test.controller;

import com.bridge.markdown_test.repository.Test;
import com.bridge.markdown_test.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestRepository testRepository;

    @GetMapping("test")
    public String test() {
        Test test = new Test("hello");
        testRepository.save(test);

        return "success";
    }
}
