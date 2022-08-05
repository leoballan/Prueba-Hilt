package com.vila.testhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

// esta anotacion se usa en todas las activities , fragments o servicios donde uses hilt
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // con inject le decimos a hilt que injectaremos una clase de tipo warrior
    @Inject
    lateinit var mWarrior: Warrior
    @Inject
    lateinit var legion: Legion
    @Inject
    lateinit var orco :Orco
    @Inject
    lateinit var casttle: Casttle
    @Inject
    @Named("string")
    lateinit var primerString: String
    @Inject
    @Named("string2")
    lateinit var segundoString:String


    private val  viewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

    }

    fun init(){
        mWarrior.printAction()
        legion.fight()
        orco.fight()
        casttle.defense()
        viewModel.orcoAttack()
        viewModel.getData()

        Log.d("ControlM","esto es un test ${primerString}")
        Log.d("ControlM","esto es un test ${segundoString}")

    }

}

