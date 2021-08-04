package com.navigationfragment.app.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.navigationfragment.app.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var bindingFragmentHome: FragmentHomeBinding

    var list = mutableListOf<Cat>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_home, container, false)
//        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//
//        })

        homeViewModel.list.observe(viewLifecycleOwner, Observer {
            list.addAll(it)
        })

        bindingFragmentHome = FragmentHomeBinding.inflate(inflater, container, false)
//        addCat()
        var adapter: CatAdapter = CatAdapter(list)
        bindingFragmentHome.list.adapter = adapter
        bindingFragmentHome.list.layoutManager =
            LinearLayoutManager(context, GridLayoutManager.HORIZONTAL, false)

        return bindingFragmentHome.root
    }

    private fun addCat() {
        list.add(Cat("Barsick", 1))
        list.add(Cat("Barsick1", 2))
        list.add(Cat("Barsick2", 3))
        list.add(Cat("Barsick3", 4))
    }

}