package com.kaimiya.gaurav.todolist.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface ToDoRepository {
    suspend fun insertToDo(todo: ToDo)

    suspend fun deleteToDo(todo: ToDo)

    suspend fun getTodoById(id: Int): ToDo?

    fun getToDos(): Flow<List<ToDo>>
}