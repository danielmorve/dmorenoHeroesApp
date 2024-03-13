package com.example.loginapp.mockdata

import com.example.loginapp.models.User

class MockData {
    companion object{
        val users = listOf<User>(
            User(email = "daniel@gmail.com", password = "12345"),
            User(email = "daniel@gmail.com", password = "12345"),
            User(email = "daniel@gmail.com", password = "12345"),
        )

        fun getUsers(){
            println("Get users")
        }
    }
}