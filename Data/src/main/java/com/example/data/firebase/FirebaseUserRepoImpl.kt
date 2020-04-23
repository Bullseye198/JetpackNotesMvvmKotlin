package com.example.data.firebase

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.wiseassblog.jetpacknotesmvvmkotlin.common.Result
import com.wiseassblog.jetpacknotesmvvmkotlin.common.awaitTaskCompletable
import com.example.domain.user.model.User
import com.wiseassblog.jetpacknotesmvvmkotlin.model.repository.IUserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FirebaseUserRepoImpl @Inject constructor() : IUserRepository {

    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    override suspend fun signInGoogleUser(idToken: String):
            Result<Exception, Unit> = withContext(Dispatchers.IO) {
        try {
            val credential = GoogleAuthProvider.getCredential(idToken, null)
            awaitTaskCompletable(auth.signInWithCredential(credential))

            Result.build { Unit }
        } catch (exception: Exception) {
            Result.build { throw exception }
        }

    }


    override suspend fun signOutCurrentUser(): Result<Exception, Unit> {
        return Result.build {
            auth.signOut()
        }
    }

    override suspend fun getCurrentUser(): Result<Exception, User?> {
        val firebaseUser = auth.currentUser

        return if (firebaseUser == null) {
            Result.build { null }
        } else {
            Result.build {
                User(
                    firebaseUser.uid,
                    firebaseUser.displayName ?: ""
                )
            }
        }
    }
}