package com.hamurcuabi.assitedinjection

import com.hamurcuabi.assitedinjection.repo.FakeRepo
import com.hamurcuabi.assitedinjection.repo.FakeRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
internal interface AppModule {

    @Binds
    fun bindFakeRepository(impl: FakeRepoImpl): FakeRepo

}