package org.d3if0042.galerihewan.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.d3if0042.galerihewan.Hewan
import org.d3if0042.galerihewan.R


class MainViewModel : ViewModel() {
    private val data = MutableLiveData<List<Hewan>>()
    init {
        data.value = initData()
    }

    private fun initData(): List<Hewan> {
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
            Hewan("Sapi", "Bos taurus",R.drawable.sapi, m),
        )
    }

    fun getData(): LiveData<List<Hewan>> = data
}