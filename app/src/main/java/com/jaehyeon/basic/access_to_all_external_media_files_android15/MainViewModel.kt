package com.jaehyeon.basic.access_to_all_external_media_files_android15

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created by jaehyeon.
 * Date: 2024. 9. 3.
 */
class MainViewModel(
    private val mediaReader: MediaReader
): ViewModel() {

    var files by mutableStateOf(listOf<MediaFile>())
        private set

    fun init() {
        viewModelScope.launch(Dispatchers.IO) {
            files = mediaReader.getAllMediaFiles()
        }
    }
}