package com.solarexsoft.roomwordsample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by houruhou on 2021/9/2/5:32 PM
 * Desc:
 */
@Entity(tableName = "word_table")
data class Word(@PrimaryKey(autoGenerate = true) val id: Int, @ColumnInfo(name = "word") val word: String)