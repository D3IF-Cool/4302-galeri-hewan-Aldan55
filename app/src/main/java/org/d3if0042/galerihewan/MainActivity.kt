package org.d3if0042.galerihewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if0042.galerihewan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Log.d("MainActivity", "Jumlah data:"+getData().size)
        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }

    }
    private fun getData(): List<Hewan>{
        val m= "Mamalia"
        val u= "Unggas"
        val r= "Reptil"
        return listOf(
                Hewan("Angsa", "Cygnus olor", R.drawable.angsa, u),
                Hewan("Ayam", "Gallus gallus", R.drawable.ayam, u),
                Hewan("Bebek", "Cairina moschata",R.drawable.bebek, u),
                Hewan("Domba", "Ovis ammon",R.drawable.domba, m),
                Hewan("Kalkun", "Meleagris gallopavo",R.drawable.kalkun, u),
                Hewan("Kambing", "Capricornis sumatrensis",R.drawable.kambing, m),
                Hewan("Kelinci", "Oryctolagus cuniculus",R.drawable.kelinci, m),
                Hewan("Kerbau", "Bubalus bubalis",R.drawable.kerbau, m),
                Hewan("Kuda", "Equus caballus",R.drawable.kuda, m),
                Hewan("Sapi", "Bos taurus",R.drawable.sapi, m),)
    }



}