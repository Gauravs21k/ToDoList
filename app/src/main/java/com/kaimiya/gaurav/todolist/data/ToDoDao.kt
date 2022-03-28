package com.kaimiya.gaurav.todolist.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertToDo(todo: ToDo)

    @Delete
    suspend fun deleteToDo(todo: ToDo)
    
    @Query("SELECT * FROM todo WHERE id = :id"  )
    suspend fun getTodoById(id: Int): ToDo?

   @Query("SELECT * FROM todo")
    fun getToDos(): Flow<List<ToDo>>
}