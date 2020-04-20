package com.example.data.injection

import com.example.data.fakeData.FakeDataRepositoryImpl
import com.example.domain.offers.TestRepository
import com.sun.corba.se.impl.activation.RepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun BindFakeRepository(fakeDataRepositoryImpl: FakeDataRepositoryImpl): TestRepository
}