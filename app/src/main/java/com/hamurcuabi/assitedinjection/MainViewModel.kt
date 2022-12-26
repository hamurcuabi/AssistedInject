package com.hamurcuabi.assitedinjection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hamurcuabi.assitedinjection.repo.FakeRepo
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class MainViewModel @AssistedInject constructor(
    private val fakeRepo: FakeRepo,
    @Assisted
    private val userId: Int
) : ViewModel() {

    fun getData() = fakeRepo.getData() + userId

    @AssistedFactory
    interface Factory {

        fun create(userId: Int): MainViewModel
    }

    companion object {

        fun provideFactory(factory: Factory, userId: Int): ViewModelProvider.Factory {
            return object : ViewModelProvider.Factory {
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return factory.create(userId) as T
                }
            }
        }
    }
}