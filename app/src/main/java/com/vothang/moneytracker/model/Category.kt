package com.vothang.moneytracker.model

data class Category(
    val id: Int,
    val name: String,
    val iconRes: Int, // resource ID của icon
    val colorHex: String, // mã màu hex
    val type: TransactionType
)