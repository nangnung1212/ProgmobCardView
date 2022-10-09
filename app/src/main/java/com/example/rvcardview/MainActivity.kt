package com.example.rvcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var cvSample : RecyclerView
    lateinit var petaniCVAdapter: PetaniCVAdapter
    lateinit var lPetaniCVAdapter: List<Petani>
    lateinit var lPetani : List<Petani>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cvSample = findViewById(R.id.rvCardView)

        lPetani = listOf(
            Petani(user = "AW", nama = "Argo Wibowo", jumlahLahan = "100", identifikasi = "50", tambahLahan = "50"),
            Petani(user = "AW2", nama = "Argo Wibowo", jumlahLahan = "100", identifikasi = "50", tambahLahan = "50"),
            Petani(user = "AW3", nama = "Argo Wibowo", jumlahLahan = "100", identifikasi = "50", tambahLahan = "50"),
            Petani(user = "AW4", nama = "Argo Wibowo", jumlahLahan = "100", identifikasi = "50", tambahLahan = "50"),
            Petani(user = "AW5", nama = "Argo Wibowo", jumlahLahan = "100", identifikasi = "50", tambahLahan = "50"),
        )
        petaniCVAdapter = PetaniCVAdapter(lPetani)

        cvSample.apply{
            layoutManager = LinearLayoutManager( this@MainActivity)
            adapter = petaniCVAdapter

        }
    }
}