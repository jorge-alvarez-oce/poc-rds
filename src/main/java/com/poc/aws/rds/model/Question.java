package com.poc.aws.rds.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@Builder
public class Question {

    @Id
    private Integer id;

    private String description;
}
