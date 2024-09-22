package com.themyntt.dao_cae_demo.core.use_cases.todo_creation;

import com.themyntt.dao_cae_demo.core.use_cases.todo_creation.io.inputs.TodoCreationUseCaseInput;
import com.cae.use_cases.specifics.consumers.ConsumerUseCase;
import org.springframework.http.ResponseEntity;

/**
 * This is the contract of the TodoCreationUseCase.
 * Its input is mapped within the TodoCreationUseCaseInput class.
 */
public abstract class TodoCreationUseCase extends ConsumerUseCase<TodoCreationUseCaseInput> {
    public abstract ResponseEntity<?> run(TodoCreationUseCaseInput input);
}
