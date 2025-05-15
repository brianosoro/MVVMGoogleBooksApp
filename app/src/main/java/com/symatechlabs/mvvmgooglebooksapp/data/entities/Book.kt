package com.symatechlabs.mvvmgooglebooksapp.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books")
data class Book(
    @PrimaryKey(autoGenerate = true) val bid: Int,
    @ColumnInfo(name = "id") val id: String?,
    @ColumnInfo(name = "title") val title: String? = "",
    @ColumnInfo(name = "subtitle") val subTitle: String? = "",
    @ColumnInfo(name = "authors") val authors: String? = "",
    @ColumnInfo(name = "publisher") val publisher: String? = "",
    @ColumnInfo(name = "publishedDate") val publishedDate: String? = "",
    @ColumnInfo(name = "description") val description: String? = "",
    @ColumnInfo(name = "industryIdentifiers") val industryIdentifiers: Int = 0,
    @ColumnInfo(name = "pageCount") val pageCount: Int? = null,
    @ColumnInfo(name = "printType") val mail: String? = "",
    @ColumnInfo(name = "categories") val categories: String? = "",
    @ColumnInfo(name = "imageLinks") val imageLinks: String? = "",
    @ColumnInfo(name = "language") val language: String? = "",
    @ColumnInfo(name = "webReaderLink") val webReaderLink: String? = "",
    @ColumnInfo(name = "textSnippet") val textSnippet: String? = ""
)
