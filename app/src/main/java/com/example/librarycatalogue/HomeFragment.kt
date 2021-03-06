package com.example.librarycatalogue

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.example.librarycatalogue.adapters.BookSectionAdapter
import com.example.librarycatalogue.data.BookSection
import com.example.librarycatalogue.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding: FragmentHomeBinding = DataBindingUtil.inflate(
                    inflater ,R.layout.fragment_home,container,false)

        binding.bookSectionRecyclerView.layoutManager = GridLayoutManager(context,2)
        binding.bookSectionRecyclerView.adapter = BookSectionAdapter(bookSectionList())

        return binding.root

    }
   private fun bookSectionList():List<BookSection>{
       return listOf(
           BookSection(R.drawable.comic),
           BookSection(R.drawable.math),
           BookSection(R.drawable.science),
           BookSection(R.drawable.programming),
           BookSection(R.drawable.children),
           BookSection(R.drawable.love),
           BookSection(R.drawable.history),
           BookSection(R.drawable.comic),
           BookSection(R.drawable.comic),
           BookSection(R.drawable.comic),
           BookSection(R.drawable.comic),
           BookSection(R.drawable.comic)

       )
   }


}
