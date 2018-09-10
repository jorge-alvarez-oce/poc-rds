package com.poc.aws.rds.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Question {

    private Integer id;

    private String description;
}
