package com.vothang.moneytracker.model

// Dùng trong ViewModel để quản lý trạng thái UI (đang tải, thành công, lỗi, trống)
sealed class UiState<out T> {
    object Loading: UiState<Nothing>()
    data class Success<T>(val data: T): UiState<T>()
    data class Error(val message: String): UiState<Nothing>()
    object Empty: UiState<Nothing>()
}