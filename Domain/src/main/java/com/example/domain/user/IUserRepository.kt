package com.example.domain.user

import com.example.domain.user.model.User

interface IUserRepository {
    suspend fun getCurrentUser(): Result<Exception, User?>

    suspend fun signOutCurrentUser(): Result<Exception, Unit>

    suspend fun signInGoogleUser(idToken: String): Result<Exception, Unit>
}