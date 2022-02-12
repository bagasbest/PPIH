package com.project.ppih.menu.feedback

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.ppih.databinding.ItemFeedbackBinding

class FeedbackAdapter : RecyclerView.Adapter<FeedbackAdapter.ViewHolder>() {

    private val feedbackList = ArrayList<FeedbackModel>()

    @SuppressLint("NotifyDataSetChanged")
    fun setData(items: ArrayList<FeedbackModel>) {
        feedbackList.clear()
        feedbackList.addAll(items)
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemFeedbackBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(model: FeedbackModel) {
            with(binding) {
               name.text = "Nama: ${model.name}"
               rate.text = "Penilaian: ${model.rate}"
               comment.text = "Komentar: ${model.coment}"
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemFeedbackBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(feedbackList[position])
    }

    override fun getItemCount(): Int = feedbackList.size
}