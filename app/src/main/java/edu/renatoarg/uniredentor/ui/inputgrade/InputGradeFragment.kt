package edu.renatoarg.uniredentor.ui.inputgrade

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import edu.renatoarg.uniredentor.R
import kotlinx.android.synthetic.main.fragment_input_grade.*

/**
 * A simple [Fragment] subclass.
 */
class InputGradeFragment : Fragment(R.layout.fragment_input_grade) {

    private val liveData = MutableLiveData<Int>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        liveData.observe(viewLifecycleOwner, Observer { grade ->
            when (grade) {
                in 0..6 -> {findNavController().navigate(R.id.action_inputGradeFragment_to_failFragment)}
                in 7..Int.MAX_VALUE -> findNavController().navigate(R.id.action_inputGradeFragment_to_approvedFragment)
            }
        })

        submit.setOnClickListener {
            liveData.value = gradle.text.toString().toInt()
            liveData.value = -1
            gradle.text.clear()
        }
        
    }

}
