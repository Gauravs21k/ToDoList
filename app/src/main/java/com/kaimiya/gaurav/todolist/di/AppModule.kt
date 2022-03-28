package com.kaimiya.gaurav.todolist.di

import android.app.Application
import androidx.room.Room
import com.kaimiya.gaurav.todolist.data.ToDoDatabase
import com.kaimiya.gaurav.todolist.data.ToDoRepository
import com.kaimiya.gaurav.todolist.data.ToDoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideToDoDatabase(app: Application): ToDoDatabase  {
        return Room.databaseBuilder(app, ToDoDatabase::class.java, "todo_db").build()
    }

    @Provides
    @Singleton
    fun provideToDoRepository(db: ToDoDatabase): ToDoRepository {
        return ToDoRepositoryImpl(db.todoDao)
    }
}