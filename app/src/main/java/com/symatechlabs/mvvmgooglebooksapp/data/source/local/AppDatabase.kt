package com.symatechlabs.mvvmgooglebooksapp.data.source.local


import androidx.room.Database
import androidx.room.RoomDatabase
import com.symatechlabs.mvvmgooglebooksapp.data.dao.BooksDao
import com.symatechlabs.mvvmgooglebooksapp.data.entities.Book

@Database(entities = [Book::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun booksDao(): BooksDao;
}