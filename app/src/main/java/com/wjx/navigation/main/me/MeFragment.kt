package com.wjx.navigation.main.me

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wjx.navigation.databinding.FragmentHomeBinding
import com.wjx.navigation.databinding.FragmentMeBinding

class MeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewBinding = FragmentMeBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

}