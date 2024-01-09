package com.devscode.simplerestaplication

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.devscode.simplerestaplication.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class UserViewModel @Inject constructor(

    private val userRepositoryImp: UserRepository

) : ViewModel() {

    fun getUser(){
        viewModelScope.launch(Dispatchers.IO) {
            val user = userRepositoryImp.getNewUser()
            Log.d("UserViewModel", user.toString())
        }
    }
}