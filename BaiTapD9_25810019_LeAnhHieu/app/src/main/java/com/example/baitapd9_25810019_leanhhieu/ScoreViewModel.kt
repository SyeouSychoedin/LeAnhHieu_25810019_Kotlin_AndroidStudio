package com.example.baitapd9_25810019_leanhhieu


import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class ScoreUiState(
    val diemDoi1: Int = 0,
    val diemDoi2: Int = 0
)

class ScoreViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(ScoreUiState())
    val uiState: StateFlow<ScoreUiState> = _uiState.asStateFlow()

    fun tangDiem(laDoi1: Boolean) {
        _uiState.update { hienTai ->
            if (laDoi1) {
                hienTai.copy(diemDoi1 = hienTai.diemDoi1 + 1)
            } else {
                hienTai.copy(diemDoi2 = hienTai.diemDoi2 + 1)
            }
        }
    }

    fun giamDiem(laDoi1: Boolean) {
        _uiState.update { hienTai ->
            if (laDoi1) {
                if (hienTai.diemDoi1 > 0) hienTai.copy(diemDoi1 = hienTai.diemDoi1 - 1)
                else hienTai
            } else {
                if (hienTai.diemDoi2 > 0) hienTai.copy(diemDoi2 = hienTai.diemDoi2 - 1)
                else hienTai
            }
        }
    }

    fun reset() {
        _uiState.value = ScoreUiState()
    }
}