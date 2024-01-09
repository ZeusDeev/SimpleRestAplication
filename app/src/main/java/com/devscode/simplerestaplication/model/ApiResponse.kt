package com.devscode.simplerestaplication.model

data class ApiResponse (
    val result: List<Results> = emptyList()
)

data class Results(
    val name: UserName?,
    val location: UserLocation?,
    val picture: UserPicture?
)