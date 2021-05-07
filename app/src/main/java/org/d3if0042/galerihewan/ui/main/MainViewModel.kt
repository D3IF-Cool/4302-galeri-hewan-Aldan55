package org.d3if0042.galerihewan.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.d3if0042.galerihewan.Hewan
import org.d3if0042.galerihewan.R
import org.d3if0042.galerihewan.network.HewanApi


class MainViewModel : ViewModel() {
    private val data = MutableLiveData<List<Hewan>>()
    init {
        data.value = initData()
        retrieveData()

    }

    private fun retrieveData() {
        viewModelScope.launch {
            try {
                val result = HewanApi.service.getHewan()
                Log.d("MainViewModel", "Success: $result")
            } catch (e: Exception) {
                Log.d("MainViewModel", "Failure: ${e.message}")
            }
        }
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