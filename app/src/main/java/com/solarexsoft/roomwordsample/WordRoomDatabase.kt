package com.solarexsoft.roomwordsample

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * Created by houruhou on 2021/9/2/5:42 PM
 * Desc:
 */
@Database(entities = [Word::class], version = 1, exportSchema = false)
public abstract class WordRoomDatabase : RoomDatabase() {
    companion object {
        @Volatile
        private var INSTANCE: WordRoomDatabase? = null

        fun getDatabase(context: Context): WordRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WordRoomDatabase::class.java,
                    "word_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
    abstract fun wordDao(): WordDao
}