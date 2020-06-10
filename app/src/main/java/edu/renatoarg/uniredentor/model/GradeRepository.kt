package edu.renatoarg.uniredentor.model

class GradeRepository {

    fun checkApproval(grade: Int) : Boolean {
        return grade >= 7
    }

}