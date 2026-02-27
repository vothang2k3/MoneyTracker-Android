package com.vothang.moneytracker.model

object DefaultCategories {
    val expenseCategories = listOf(
        Category(1, "Ăn uống", android.R.drawable.ic_menu_sort_by_size, "#FF5722", TransactionType.Expense),
        Category(2, "Di chuyển", android.R.drawable.ic_menu_directions, "#2196F3", TransactionType.Expense),
        Category(3, "Mua sắm", android.R.drawable.ic_menu_view, "#9C27B0", TransactionType.Expense),
        Category(4, "Giải trí", android.R.drawable.ic_menu_gallery, "#E91E63", TransactionType.Expense),
        Category(5, "Hóa đơn", android.R.drawable.ic_menu_agenda, "#FF9800", TransactionType.Expense),
        Category(6, "Y tế", android.R.drawable.ic_menu_add, "#4CAF50", TransactionType.Expense)
    )

    val incomeCategories = listOf(
        Category(7, "Lương", android.R.drawable.ic_menu_month, "#4CAF50", TransactionType.Income),
        Category(8, "Thưởng", android.R.drawable.ic_dialog_info, "#FFC107", TransactionType.Income),
        Category(9, "Đầu tư", android.R.drawable.ic_menu_today, "#00BCD4", TransactionType.Income),
        Category(10, "Khác", android.R.drawable.ic_menu_help, "#9E9E9E", TransactionType.Income)
    )

    val all = expenseCategories + incomeCategories
}