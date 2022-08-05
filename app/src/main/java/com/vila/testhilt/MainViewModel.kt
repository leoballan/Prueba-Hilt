package com.vila.testhilt

import android.util.Log
import androidx.lifecycle.ViewModel
import com.vila.testhilt.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject
constructor(val orco: Orco, val repository: Repository) : ViewModel() {

    fun orcoAttack() {
        orco.fight()
    }

    fun getData() {
        Log.d("webservice", "dentro de la funcion get Data para probar inject")
        repository.bringData()
    }

}