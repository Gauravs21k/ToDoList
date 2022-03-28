package com.kaimiya.gaurav.todolist.data

import androidx.room.PrimaryKey

class ToDo(
    val title: String,
    val description: String,
    val isDone: Boolean,
    @PrimaryKey
    val id: Int? = null
) {

}