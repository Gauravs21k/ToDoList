package com.kaimiya.gaurav.todolist.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ToDo::class],
    version = 1
)
abstract class TodoDatabase: RoomDatabase() {
    abstract val todoDao: ToDoDao
}