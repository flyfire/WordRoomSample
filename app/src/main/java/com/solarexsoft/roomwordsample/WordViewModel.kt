package com.solarexsoft.roomwordsample

import androidx.lifecycle.*
import kotlinx.coroutines.launch

/**
 * Created by houruhou on 2021/9/2/5:51 PM
 * Desc:
 */
class WordViewModel(private val repository: WordRepository): ViewModel() {
    val allWords: LiveData<List<Word>> = repository.allWords.asLiveData()

    fun insert(word: Word) {
        viewModelScope.launch {
            repository.insert(word)
        }
    }
}

class WordViewModelFactory(private val repository: WordRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WordViewModel::class.java)) {
            return WordViewModel(repository) as T
        }
        error("unknown viewmodel class")
    }

}