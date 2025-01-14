package com.bridge.markdown_test.controller;

import com.bridge.markdown_test.service.MarkdownService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/markdown")
public class MarkdownController {

    private final MarkdownService markdownService;

    @GetMapping("/form")
    public ModelAndView getMarkdownForm() {
        return new ModelAndView("markdownForm");
    }

    @PostMapping("/save")
    public String saveMarkdown(@RequestParam String content) {
        markdownService.parseMarkdownToHtml(content);
        return "success";
    }
}
