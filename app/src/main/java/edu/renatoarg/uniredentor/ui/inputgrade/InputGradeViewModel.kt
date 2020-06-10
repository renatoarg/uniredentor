package edu.renatoarg.uniredentor.ui.inputgrade

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InputGradeViewModel : ViewModel(), LifecycleObserver {

    private val liveData = MutableLiveData<InputGradeState>()

    fun getLiveData(): LiveData<InputGradeState> {
        return liveData
    }

    fun checkGrade(grade: Int) {
        when (grade) {
            in 0..6 -> liveData.value = InputGradeState.Fail
            in 7..Int.MAX_VALUE -> liveData.value = InputGradeState.Approved
        }
        liveData.value = InputGradeState.Clear
    }

}