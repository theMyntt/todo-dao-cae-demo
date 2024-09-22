package com.themyntt.dao_cae_demo.adapters.io.inputs;

import com.themyntt.dao_cae_demo.assemblers.use_cases.todo_creation.TodoCreationUseCaseAssembler;
import com.themyntt.dao_cae_demo.core.use_cases.todo_creation.TodoCreationUseCase;
import com.themyntt.dao_cae_demo.core.use_cases.todo_creation.io.inputs.TodoCreationUseCaseInput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todo/create")
public class TodoCreationController {
    private static final TodoCreationUseCase useCase = TodoCreationUseCaseAssembler.V1;

    @PostMapping
    public ResponseEntity<?> perform(@RequestBody TodoCreationUseCaseInput input) {
        return useCase.run(input);
    }
}
