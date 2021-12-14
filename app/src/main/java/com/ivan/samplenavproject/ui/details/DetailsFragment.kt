package com.ivan.samplenavproject.ui.details

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.ivan.samplenavproject.MainActivity
import com.ivan.samplenavproject.R
import kotlinx.android.synthetic.main.fragment_details.*

class DetailsFragment : Fragment(R.layout.fragment_details) {
    private val args: DetailsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as? MainActivity)?.updateToolBar("Details", true)
        setHasOptionsMenu(false)
        args.title?.let {
            tvTitle?.text = it
        }

    }
}