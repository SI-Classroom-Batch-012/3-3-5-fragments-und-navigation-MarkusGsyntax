package com.example.phonebook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.phonebook.adapter.ItemAdapter
import com.example.phonebook.databinding.FragmentNoticeBinding


class NoticeFragment : Fragment() {

    private lateinit var binding: FragmentNoticeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNoticeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mainActivity = activity as MainActivity

        val notices = mainActivity.data
        val itemAdapter = ItemAdapter(notices)

        binding.recyclerView.adapter = itemAdapter

        binding.faBTN.setOnClickListener {

        }

    }
}