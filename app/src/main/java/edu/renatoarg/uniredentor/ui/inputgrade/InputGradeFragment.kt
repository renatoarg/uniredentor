package edu.renatoarg.uniredentor.ui.inputgrade

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import edu.renatoarg.uniredentor.R
import kotlinx.android.synthetic.main.fragment_input_grade.*

/**
 * A simple [Fragment] subclass.
 */
class InputGradeFragment : Fragment(R.layout.fragment_input_grade) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        submit.setOnClickListener {
            when(gradle.text.toString().toInt()) {
                in 7..Int.MAX_VALUE -> findNavController().navigate(R.id.action_inputGradeFragment_to_approvedFragment)
                else -> findNavController().navigate(R.id.action_inputGradeFragment_to_failFragment)
            }
        }
    }

}
