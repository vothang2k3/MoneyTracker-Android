package com.vothang.moneytracker.utils

import java.text.NumberFormat
import java.util.Locale

import com.vothang.moneytracker.model.TransactionType

fun Double.toVND(): String {
    val locale = Locale.forLanguageTag("vi-VN")
    val formatter = NumberFormat.getCurrencyInstance(locale)
    return formatter.format(this)
}

/*fun String.toTransactionTypeLabel(): String {
    return when(this) {
        "income" -> "Thu nhập"
        "expense" -> "Chi tiêu"
        else -> "Không hợp lệ!"
    }
}*/

fun TransactionType.label() : String {
    return when(this) {
        TransactionType.Income -> "Thu nhập"
        TransactionType.Expense -> "Chi tiêu"
        else -> "Không hợp lệ!"
    }
}

fun classifyAmount(amount: Double): String {
    return when {
        amount >= 0 && amount < 100000  -> "Nhỏ"
        amount >= 100000 && amount < 1000000 -> "Trung bình"
        amount >= 1000000 -> "Lớn"
        else -> "Không hợp lệ!"
    }
}

