package com.kaimiya.gaurav.todolist.data

import kotlinx.coroutines.flow.Flow

class ToDoRepositoryImpl(private val todoDao: ToDoDao): ToDoRepository {
    override suspend fun insertToDo(todo: ToDo) {
        todoDao.insertToDo(todo)
    }

    override suspend fun deleteToDo(todo: ToDo) {
        todoDao.deleteToDo(todo)
    }

    override suspend fun getTodoById(id: Int): ToDo? {
        return todoDao.getTodoById(id)
    }

    override fun getToDos(): Flow<List<ToDo>> {
        return todoDao.getToDos()
    }
}