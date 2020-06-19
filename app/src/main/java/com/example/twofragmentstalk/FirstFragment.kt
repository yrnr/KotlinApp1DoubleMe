package com.example.twofragmentstalk

import android.content.res.Resources
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import java.util.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val temp = arguments?.getString("f2String").toString()
        if (temp == "null") {
            view.findViewById<TextView>(R.id.textview_first).text = "2"
            view.findViewById<TextView>(R.id.textview2_first).text = "1 + 1"
        }
        else {
//            view.findViewById<TextView>(R.id.textview_first).text = (temp.toBigInteger() + temp.toBigInteger()).toString()
            view.findViewById<TextView>(R.id.textview_first).text = String.format("%s", (temp.toBigInteger() + temp.toBigInteger()).toString())
            view.findViewById<TextView>(R.id.textview2_first).text = String.format(getString(R.string.textview2_first), temp)
        }

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            val f1String = view.findViewById<TextView>(R.id.textview_first).text.toString()
            val f1StringSquare = (f1String.toBigInteger() + f1String.toBigInteger()).toString()
            val bundle = bundleOf("f1String" to f1String, "f1StringSquare" to f1StringSquare)
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, bundle)
        }
    }
}