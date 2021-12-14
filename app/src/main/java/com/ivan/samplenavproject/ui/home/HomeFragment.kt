package com.ivan.samplenavproject.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ivan.samplenavproject.MainActivity
import com.ivan.samplenavproject.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as? MainActivity)?.updateToolBar("Home")
        setHasOptionsMenu(true)

        btnNavDetails?.setOnClickListener {
            navigateToDetails()
        }
    }

    private fun navigateToDetails() {
        findNavController().navigate(
            HomeFragmentDirections.actionHomeFragmentToDetailsFragment(
                "Here is the details"
            )
        )
    }

}