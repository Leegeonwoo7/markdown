package com.bridge.markdown_test.service;

import com.bridge.markdown_test.repository.Requirement;
import com.bridge.markdown_test.repository.RequirementRepository;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;

@Service
@RequiredArgsConstructor
@Log4j2
public class MarkdownService {

    private final RequirementRepository requirementRepository;

    /**
     * 클라이언트가 입력한 markdown 컨텐츠를 파일(또는 TEXT)로 저장하기위해 HTML 형식으로 변환
     */
    public void parseMarkdownToHtml(String content) {
        String filename = "test";
        Parser parser = Parser.builder()
                .build();
        HtmlRenderer htmlRenderer = HtmlRenderer.builder()
                .build();

        String htmlContent = htmlRenderer.render(parser.parse(content));
        File file = new File(filename);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(htmlContent);
            bufferedWriter.close();

            byte[] fileBytes = Files.readAllBytes(file.toPath());

            Requirement requirement = new Requirement(filename, fileBytes);
            requirementRepository.save(requirement);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
