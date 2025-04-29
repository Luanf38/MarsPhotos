package com.example.marsphotos.fake

import com.example.marsphotos.MarsApiService.network.MarsApiService
import com.example.marsphotos.MarsApiService.network.MarsPhoto

class FakeMarsApiService: MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> = FakeDataSource.photosList

}