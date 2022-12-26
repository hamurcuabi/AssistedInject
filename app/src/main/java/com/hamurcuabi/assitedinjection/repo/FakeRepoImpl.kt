package com.hamurcuabi.assitedinjection.repo

import javax.inject.Inject

class FakeRepoImpl @Inject constructor() : FakeRepo {

    override fun getData(): String {
        return "FakeRepoImpl data"
    }
}