package com.example.twofragmentstalk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.textview_second).text =
            arguments?.getString("f1StringSquare").toString()

        val temp = arguments?.getString("f1String").toString()
        view.findViewById<TextView>(R.id.text_view2_second).text = "$temp + $temp"

        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            val f2String = view.findViewById<TextView>(R.id.textview_second).text
            val bundle = bundleOf("f2String" to f2String)
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment, bundle)
        }
    }
}