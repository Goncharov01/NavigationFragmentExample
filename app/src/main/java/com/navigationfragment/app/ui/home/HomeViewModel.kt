package com.navigationfragment.app.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _list = MutableLiveData<List<Cat>>().apply {
        value = mutableListOf<Cat>(
            Cat("Barsik1", 1),
            Cat("Barsik5", 16),
            Cat("Barsik8", 15),
            Cat("Barsik9", 17)
        )
    }
    var list: LiveData<List<Cat>> = _list
}