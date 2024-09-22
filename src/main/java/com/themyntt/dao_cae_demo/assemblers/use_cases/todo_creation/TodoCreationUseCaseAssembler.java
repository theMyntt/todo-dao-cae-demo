package com.themyntt.dao_cae_demo.assemblers.use_cases.todo_creation;

import com.themyntt.dao_cae_demo.core.use_cases.todo_creation.TodoCreationUseCase;
import com.themyntt.dao_cae_demo.core.use_cases.todo_creation.implementations.TodoCreationUseCaseImplementation;
import com.cae.use_cases.assemblers.UseCaseAssembler;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * This class creates a singleton object for the TodoCreationUseCase class.
 * You can use this class to access the instance of this use case anywhere.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TodoCreationUseCaseAssembler implements UseCaseAssembler<TodoCreationUseCase>{

    public static final TodoCreationUseCaseAssembler SINGLETON_ASSEMBLER = new TodoCreationUseCaseAssembler();

    // You might want to preserve the V1 and as new versions of your implementation gets created, increment here with new versions (V1, V2, V3...)
    public static final TodoCreationUseCase V1 = new TodoCreationUseCaseImplementation();

    // You can select the main version of your use case implementation here. This way anywhere calling this method will automatically be upgraded with the new default version.
    @Override
    public TodoCreationUseCase getDefaultAssembledInstance(){
        return V1;
    }
}