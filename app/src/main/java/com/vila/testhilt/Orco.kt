package com.vila.testhilt


import android.content.Context
import android.util.Log
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class Orco
@Inject
constructor(@ActivityContext val context : Context){
    fun fight(){
        Log.d("controlM",context.getString(R.string.orco_attack))
    }

}