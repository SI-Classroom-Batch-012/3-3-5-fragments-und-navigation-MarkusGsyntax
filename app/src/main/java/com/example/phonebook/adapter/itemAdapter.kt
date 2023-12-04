package com.example.phonebook.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.phonebook.NoticeFragmentDirections
import com.example.phonebook.data.Notice
import com.example.phonebook.databinding.ListItemBinding

class ItemAdapter(
    private val dataset: List<Notice>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /**
     * der ViewHolder umfasst die View uns stellt einen Listeneintrag dar
     */
    inner class ItemViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)

    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]

        holder.binding.tvItemName.text = item.title
        holder.binding.tvItemNumber.text = item.notice

        holder.binding.contactCard.setOnClickListener {

            holder.itemView.findNavController().navigate(NoticeFragmentDirections.actionNoticeFragmentToDetailFragment())
        }
    }
    override fun getItemCount(): Int {
       return dataset.size
    }
}
