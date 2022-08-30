package com.wjx.navigation.main.all

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wjx.navigation.databinding.FragmentAllBinding
import com.wjx.navigation.databinding.FragmentHomeBinding

class AllFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewBinding = FragmentAllBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

}