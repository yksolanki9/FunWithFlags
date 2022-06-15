package com.example.funwithflags

data class Question(
    val id: Int,
    val question: String,
    val Image: Int,
    val options: ArrayList<String>,
    val answer: Int
)
