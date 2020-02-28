package com.example.librarycatalogue

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.librarycatalogue.adapters.BookSectionAdapter
import com.example.librarycatalogue.data.BookSection
import com.example.librarycatalogue.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var bookSectionRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding: FragmentHomeBinding = DataBindingUtil.inflate(
                    inflater ,R.layout.fragment_home,container,false)

        bookSectionRecyclerView.layoutManager = GridLayoutManager(this.context,2)
        bookSectionRecyclerView.adapter = BookSectionAdapter(bookSectionList())

        return binding.root

    }
   fun bookSectionList():List<BookSection>{
       val book_sections= listOf<BookSection>(
           BookSection(R.drawable.comic),
           BookSection(R.drawable.comic),
           BookSection(R.drawable.comic),
           BookSection(R.drawable.comic),
           BookSection(R.drawable.comic),
           BookSection(R.drawable.comic)
       )
       return book_sections
   }


}
