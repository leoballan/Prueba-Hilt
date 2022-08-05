package com.vila.testhilt

import android.util.Log
import javax.inject.Inject


class Warrior
// usamos la anotacion Inject para decirle a hilt que esta clase se puede injectar
@Inject
    constructor()  {

    fun printAction()
    {
        Log.d("ControlM","esto es un test")
    }

}