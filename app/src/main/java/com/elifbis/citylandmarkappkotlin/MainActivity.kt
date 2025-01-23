package com.elifbis.citylandmarkappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.elifbis.citylandmarkappkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val mevlana = Landmark("Mevlana Türbesi", "Konya", R.drawable.konya)
        val porsuk = Landmark("Porsuk Çayı", "Eskişehir", R.drawable.eskisehir)
        val ulucami = Landmark("Ulu Cami", "Bursa", R.drawable.bursa)
        val kizkulesi = Landmark("Kız Kulesi", "İstanbul", R.drawable.istanbul)

        landmarkList.add(mevlana)
        landmarkList.add(porsuk)
        landmarkList.add(ulucami)
        landmarkList.add(kizkulesi)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter

        // adapter eklemek gerekiyor listview görüntüsü için

        //mapping .map
        /*

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, landmarkList.map{landmark -> landmark.name })
        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener{parent, view, position, id ->
            val intent = Intent(MainActivity@this, Details::class.java)
            intent.putExtra("landmark",landmarkList.get(position))
            startActivity(intent)
        }*/

    }
}