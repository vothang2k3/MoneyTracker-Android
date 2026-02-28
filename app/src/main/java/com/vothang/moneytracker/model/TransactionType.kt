package com.vothang.moneytracker.model

sealed class TransactionType {
    object Income: TransactionType()
    object Expense: TransactionType()
}