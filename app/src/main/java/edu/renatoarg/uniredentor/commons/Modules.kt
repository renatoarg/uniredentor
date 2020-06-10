package edu.renatoarg.uniredentor.commons

import edu.renatoarg.uniredentor.model.GradeRepository
import edu.renatoarg.uniredentor.ui.inputgrade.InputGradeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val gradeModule = module {
    single { GradeRepository() }
    viewModel { InputGradeViewModel(get()) }

}