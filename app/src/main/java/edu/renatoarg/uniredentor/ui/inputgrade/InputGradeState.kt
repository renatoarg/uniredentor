package edu.renatoarg.uniredentor.ui.inputgrade

sealed class InputGradeState {

    object Approved: InputGradeState()

    object Fail: InputGradeState()

    object Clear: InputGradeState()

}