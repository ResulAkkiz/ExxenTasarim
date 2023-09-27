package com.project.exxentasarim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.exxentasarim.adapter.EpisodeRecyclerViewAdapter
import com.project.exxentasarim.databinding.ActivityMainBinding
import com.project.exxentasarim.model.Episode

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var episodeList:ArrayList<Episode>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        fillAllEpisodes()
        setContentView(view)
        binding.episodeRecyclerView.isNestedScrollingEnabled = false;
        binding.episodeRecyclerView.setHasFixedSize(false)
        binding.episodeRecyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.episodeRecyclerView.adapter=EpisodeRecyclerViewAdapter(episodeList,this);
    }

    private fun fillAllEpisodes() {
        episodeList= ArrayList()
        episodeList.add(Episode("10. Bölüm - M.Ö. 2998-2997 Eğitim Öğretim Yılı (02.06.23)",56,"episode10_thumbnail"))
        episodeList.add(Episode("9. Bölüm - İç Mimari ve Dirty Talk (26.05.23)",31,"episode9_thumbnail"))
        episodeList.add(Episode("8. Bölüm - Defter (19.05.23)",41,"episode8_thumbnail"))
        episodeList.add(Episode("7. Bölüm - Dönen Tekme (12.05.23)",41,"episode7_thumbnail"))
        episodeList.add(Episode("6. Bölüm - 165 (05.05.23)",46,"episode6_thumbnail"))
        episodeList.add(Episode("5. Bölüm - Patern (28.04.23)",47,"episode5_thumbnail"))
        episodeList.add(Episode("4. Bölüm - Kafa Nakli (21.04.23)",54,"episode4_thumbnail"))
        episodeList.add(Episode("3. Bölüm - Orta Yaş Krizi (14.04.23)",53,"episode3_thumbnail"))
        episodeList.add(Episode("2. Bölüm - Bin (07.04.23)",43,"episode2_thumbnail"))
        episodeList.add(Episode("1. Bölüm - Övgü (31.03.23)",48,"episode1_thumbnail"))
    }
}