package com.vila.testhilt

import javax.inject.Inject

class Legion
    @Inject
        constructor( var warrior: Warrior) {

    fun fight(){
        warrior.printAction()
    }
}