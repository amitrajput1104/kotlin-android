package com.android.counterviewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State

class CounterViewModel() : ViewModel() {
    private val repository: CounterRepository= CounterRepository()
    private var _count = mutableStateOf(repository.getCounter().count)

    val count: State<Int>
        get() = _count

    fun increment() {
        repository.incrementCounter()
        _count.value= repository.getCounter().count
    }

    fun decrement() {
        repository.decrementCounter()
            _count.value= repository.getCounter().count

    }
}
