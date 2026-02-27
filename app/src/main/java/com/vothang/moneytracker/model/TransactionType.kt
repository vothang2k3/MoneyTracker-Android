package com.vothang.moneytracker.model

import com.vothang.moneytracker.utils.sampleTransactions

sealed class TransactionType {
    object Income: TransactionType()
    object Expense: TransactionType()
}