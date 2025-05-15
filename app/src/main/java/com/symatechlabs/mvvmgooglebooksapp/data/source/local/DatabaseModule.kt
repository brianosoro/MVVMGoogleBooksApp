package com.symatechlabs.mvvmgooglebooksapp.data.source.local

import android.content.Context
import androidx.room.Room
import com.symatechlabs.mvvmgooglebooksapp.util.Config.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {

        return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build();
    }

    @Singleton
    @Provides
    fun provideBooksDao(appDatabase: AppDatabase) = appDatabase.booksDao();

}