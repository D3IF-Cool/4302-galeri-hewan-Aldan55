package org.d3if0042.galerihewan.ui.main

import org.d3if0042.galerihewan.Hewan
import org.d3if0042.galerihewan.MainAdapter
import org.d3if0042.galerihewan.R

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if0042.galerihewan.databinding.MainFragmentBinding

class MainFragment : Fragment() {
    private lateinit var binding: MainFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = MainFragmentBinding.inflate(layoutInflater, container, false)
        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
        return binding.root
    }

    private fun getData(): List<Hewan> {
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
