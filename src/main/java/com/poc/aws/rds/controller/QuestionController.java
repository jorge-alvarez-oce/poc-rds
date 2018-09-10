package com.poc.aws.rds.controller;

import com.poc.aws.rds.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class QuestionController {

    @GetMapping
    public List<Question> getQuestions() {
        return Arrays.asList(
                Question.builder()
                        .id(1)
                        .description("Question 1")
                        .build(),
                Question.builder()
                        .id(2)
                        .description("Question 2")
                        .build(),
                Question.builder()
                        .id(3)
                        .description("Question 3")
                        .build()
        );
    }
}
