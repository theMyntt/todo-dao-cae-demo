package com.themyntt.dao_cae_demo.adapters.io.outputs.repositories;

import com.themyntt.dao_cae_demo.core.entities.TodoEntity;
import com.themyntt.dao_cae_demo.infrastructure.databases.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TodoRepository {
    public static void insert(TodoEntity entity) throws SQLException {
        String sql = "INSERT INTO todos VALUES (?,?,?,?)";

        int isCompleted = entity.getIsCompleted() ? 0 : 1;

        PreparedStatement stmt = DatabaseConnection.getConn().prepareStatement(sql);
        stmt.setString(1, entity.getId());
        stmt.setString(2, entity.getName());
        stmt.setString(3, entity.getDescription());
        stmt.setInt(4, isCompleted);
    }
}
