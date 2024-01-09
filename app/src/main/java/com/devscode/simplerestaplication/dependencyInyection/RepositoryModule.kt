package com.devscode.simplerestaplication.dependencyInyection

import com.devscode.simplerestaplication.datasource.RestDataSource
import com.devscode.simplerestaplication.repository.UserRepository
import com.devscode.simplerestaplication.repository.UserRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Provides
    @Named("BaseUrl")
   abstract fun UserRepository(repo:UserRepositoryImp) : UserRepository

}