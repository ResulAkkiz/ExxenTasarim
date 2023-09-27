package com.project.exxentasarim.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.project.exxentasarim.databinding.SingleEpisodeItemBinding
import com.project.exxentasarim.model.Episode

class EpisodeRecyclerViewAdapter(private var episodeList: List<Episode>, var mContext: Context) :
    RecyclerView.Adapter<EpisodeRecyclerViewAdapter.EpisodeViewHolder>() {

    inner class EpisodeViewHolder(private var view: SingleEpisodeItemBinding) : ViewHolder(view.root) {
        fun bindView(episode: Episode) {
            view.episodeDuration.text = buildString {
                append(episode.duration)
                append("m")
            }
            view.episodeTitle.text = episode.title
            val image =
                mContext.resources.getIdentifier(episode.image, "drawable", mContext.packageName)
            view.episodeImageView.setImageResource(image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodeViewHolder {
        val inflater = LayoutInflater.from(mContext)
        val view = SingleEpisodeItemBinding.inflate(inflater, parent, false)
        return EpisodeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return episodeList.size
    }

    override fun onBindViewHolder(holder: EpisodeViewHolder, position: Int) {
        holder.bindView(episodeList[position])
    }
}