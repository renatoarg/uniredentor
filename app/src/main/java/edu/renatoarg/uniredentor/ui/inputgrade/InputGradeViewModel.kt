package edu.renatoarg.uniredentor.ui.inputgrade

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InputGradeViewModel : ViewModel(), LifecycleObserver {

    private val liveData = MutableLiveData<Int>()

    fun getLiveData() : LiveData<Int> {
        return liveData
    }

    fun checkGrade(grade: Int) {
        liveData.value = grade
        liveData.value = -1
    }

}