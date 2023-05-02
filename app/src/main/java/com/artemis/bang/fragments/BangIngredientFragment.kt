package com.artemis.bang.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.artemis.bang.R
import com.artemis.bang.databinding.FragmentBangIngredientBinding


class BangIngredientFragment : Fragment() {

    private var binding: FragmentBangIngredientBinding ?= null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val ingredientBinding = FragmentBangIngredientBinding.inflate(inflater, container, false)
        binding = ingredientBinding
        return ingredientBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            ingredientBangFragment = this@BangIngredientFragment
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}