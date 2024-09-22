package com.themyntt.dao_cae_demo.core.use_cases.todo_creation.implementations;

import com.themyntt.dao_cae_demo.adapters.io.outputs.repositories.TodoRepository;
import com.themyntt.dao_cae_demo.core.entities.TodoEntity;
import com.themyntt.dao_cae_demo.core.use_cases.todo_creation.TodoCreationUseCase;
import com.themyntt.dao_cae_demo.core.use_cases.todo_creation.io.inputs.TodoCreationUseCaseInput;
import com.cae.use_cases.correlations.UseCaseExecutionCorrelation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.SQLException;
import java.util.UUID;

/**
 * This class implements the TodoCreationUseCase, containing all the internal logic for its operation.
 * Since it is a ConsumerUseCase, its purpose is to do something based on its input, not returning anything.
 * <p>
 * Important: Avoid hardcoding any sensitive information in this code. The auto-documentation
 * process will analyze this section of the source code if the GPT mode is enabled.
 */
public class TodoCreationUseCaseImplementation extends TodoCreationUseCase {

    @Override
    protected void applyInternalLogic(
            TodoCreationUseCaseInput input,
            UseCaseExecutionCorrelation correlation) {
        String id = UUID.randomUUID().toString();

        TodoEntity entity = TodoEntity.builder()
                .id(id)
                .name(input.getName())
                .description(input.getDescription())
                .isCompleted(input.getIsCompleted())
                .build();

        try {
            TodoRepository.insert(entity);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ResponseEntity<?> run(TodoCreationUseCaseInput input) {
        this.applyInternalLogic(input, null);

        return ResponseEntity.noContent().build();
    }
}
