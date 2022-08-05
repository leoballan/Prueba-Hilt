package com.vila.testhilt.di

import com.vila.testhilt.data.DataProvider
import com.vila.testhilt.data.DataProviderImp
import com.vila.testhilt.data.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun providesDatasource(imp: DataProviderImp):DataProvider

    @Binds
    abstract fun providesRepository(imp: DataProviderImp): Repository


}