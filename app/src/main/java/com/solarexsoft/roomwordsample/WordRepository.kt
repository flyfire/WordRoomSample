package com.solarexsoft.roomwordsample

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

/**
 * Created by houruhou on 2021/9/2/5:48 PM
 * Desc:
 */
class WordRepository(private val wordDao: WordDao) {
    val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}