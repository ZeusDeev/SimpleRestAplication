package com.devscode.simplerestaplication.repository

import com.devscode.simplerestaplication.datasource.RestDataSource
import com.devscode.simplerestaplication.model.User
import javax.inject.Inject

interface UserRepository {
    suspend fun getNewUser():User
}

class UserRepositoryImp @Inject constructor(
    private val dataSource: RestDataSource,
) : UserRepository{
    override suspend fun getNewUser():User {
        val name = dataSource.getUserName().result[0].name!!
        val location = dataSource.getUserLocation().result[0].location!!
        val picture = dataSource.getUserPicture().result[0].picture!!
        val user = User(name.first, name.last, location.city, picture.thumbnail)

        return user;
    }

}