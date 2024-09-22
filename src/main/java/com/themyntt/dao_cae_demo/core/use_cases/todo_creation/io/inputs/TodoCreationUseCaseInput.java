package com.themyntt.dao_cae_demo.core.use_cases.todo_creation.io.inputs;

import com.cae.use_cases.io.UseCaseInput;
import lombok.Getter;
import lombok.Setter;

/**
 * This class maps the input fields for your use case. Before executing the use case,
 * the internal method UseCaseInput::validateProperties will be called to ensure each
 * field complies with its requirements.
 */
@Getter
@Setter
public class TodoCreationUseCaseInput extends UseCaseInput {
    private String name;
    private String description;
    private Boolean isCompleted;
}
