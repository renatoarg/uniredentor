package edu.renatoarg.uniredentor.ui.inputgrade

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import edu.renatoarg.uniredentor.R
import kotlinx.android.synthetic.main.fragment_input_grade.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

/**
 * A simple [Fragment] subclass.
 */
class InputGradeFragment : Fragment(R.layout.fragment_input_grade) {


    private val viewModel: InputGradeViewModel by sharedViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getLiveData().observe(viewLifecycleOwner, Observer { state ->
            when(state) {
                is InputGradeState.Approved -> findNavController().navigate(R.id.action_inputGradeFragment_to_approvedFragment)
                is InputGradeState.Fail -> findNavController().navigate(R.id.action_inputGradeFragment_to_failFragment)
                is InputGradeState.Clear -> gradle.text.clear()
            }
        })

        submit.setOnClickListener {
            viewModel.checkGrade(gradle.text.toString().toInt())
        }

    }

}
