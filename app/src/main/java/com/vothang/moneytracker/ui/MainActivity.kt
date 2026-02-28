package com.vothang.moneytracker.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vothang.moneytracker.R

//import com.vothang.moneytracker.utils.sampleTransactions
import com.vothang.moneytracker.utils.toVND

import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

/*        Log.d("MoneyTrackerTest","Income = ${calculateIncome()}")
        Log.d("MoneyTrackerTest","Income = ${calculateExpense()}")*/
    }
}

/*
fun calculateIncome(): String {
    val transactionIncome = sampleTransactions
        .filter { transaction -> transaction.type == "income" }
    return transactionIncome.sumOf { transaction -> transaction.amount }.toVND()
}

fun calculateExpense(): String {
    return sampleTransactions
        .filter { transaction -> transaction.type == "expense" }
        .sumOf { it.amount }
        .toVND()
}*/
