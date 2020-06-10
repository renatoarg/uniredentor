package edu.renatoarg.uniredentor.ui.inputgrade

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.renatoarg.uniredentor.model.GradeRepository

class InputGradeViewModel(val repository: GradeRepository) : ViewModel(), LifecycleObserver {

    private val liveData = MutableLiveData<InputGradeState>()

    fun getLiveData(): LiveData<InputGradeState> {
        return liveData
    }

    fun checkGrade(grade: Int) {
        when (repository.checkApproval(grade)) {
            true -> liveData.value = InputGradeState.Approved
            false -> liveData.value = InputGradeState.Fail
        }
        liveData.value = InputGradeState.Clear
    }

}