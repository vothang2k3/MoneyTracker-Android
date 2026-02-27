package com.vothang.moneytracker.model

data class Transaction (
    val id: Int,
    val amount: Double,
    val type: String, // "income" or "expense"
    val category: String,
    val note: String?,
    val date: String,
    // update
    val imagePath: String?,
    val categoryId: String
)