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
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding: FragmentHomeBinding = DataBindingUtil.inflate(
                    inflater ,R.layout.fragment_home,container,false)

        book_section_recycler_view.layoutManager = GridLayoutManager(this.context,2)
        book_section_recycler_view.adapter = BookSectionAdapter(bookSectionList())

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
