package com.vila.testhilt

import android.util.Log
import javax.inject.Inject

class CattleImp
    @Inject
        constructor ():Casttle {
    override fun defense() {
        Log.d("controlM","send Army to the wall")
    }

    override fun close() {
        Log.d("controlM","close the doors")
    }

    override fun open() {
        Log.d("controlM","open the doors")
    }
}