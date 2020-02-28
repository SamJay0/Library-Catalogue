package com.example.librarycatalogue.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.librarycatalogue.R
import com.example.librarycatalogue.data.BookSection

class BookSectionAdapter(private  val bookSections: List<BookSection>) : RecyclerView.Adapter<BookSectionAdapter.BookSectionViewHolder>() {

    class BookSectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val bookSectionImage:ImageView = itemView.findViewById(R.id.book_section_image)

        fun bind(bookSection: BookSection){
            bookSectionImage.setImageResource(bookSection.imageResource)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookSectionViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.book_section_list_item, parent,false)
        return BookSectionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bookSections.size
    }

    override fun onBindViewHolder(holder: BookSectionViewHolder, position: Int) {
        holder.bind(bookSections[position])
    }


}