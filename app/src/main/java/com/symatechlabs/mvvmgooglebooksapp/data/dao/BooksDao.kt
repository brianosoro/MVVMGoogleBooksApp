package com.symatechlabs.mvvmgooglebooksapp.data.dao

import androidx.room.*
import com.symatechlabs.mvvmgooglebooksapp.data.entities.Book


@Dao
interface BooksDao {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    fun insertRecord(book: Book): Long;

    @Query("SELECT * FROM books")
    fun getBooks(): List<Book>;

    @Query("SELECT * FROM books")
    fun getBooks(field: String): List<Book>;

    @Query("DELETE FROM books")
    fun deleteBooks()

    @Query("DELETE FROM books")
    fun deleteBook(id: String)

}