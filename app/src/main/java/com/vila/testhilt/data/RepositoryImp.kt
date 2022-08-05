package com.vila.testhilt.data

import javax.inject.Inject

class RepositoryImp
    @Inject
        constructor(val dataProvider: DataProvider) :Repository {

    override fun bringData() {
        dataProvider.getDataFromDataSource()
    }
}