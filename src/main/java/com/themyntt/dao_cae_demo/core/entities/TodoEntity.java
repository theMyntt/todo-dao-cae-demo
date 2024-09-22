package com.themyntt.dao_cae_demo.core.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TodoEntity {
    private String id;
    private String name;
    private String description;
    private Boolean isCompleted;
}
