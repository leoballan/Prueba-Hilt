package com.vila.testhilt.di

import com.vila.testhilt.Casttle
import com.vila.testhilt.CattleImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    @Provides
    @Singleton
    fun providesCasttle(): Casttle {
        return CattleImp()
    }

    @Provides
    @Named("string")
    fun providesString():String = "primer string"

    @Provides
    @ActivityScoped
    @Named("string2")
    fun providesString2():String = "segundo string"


}