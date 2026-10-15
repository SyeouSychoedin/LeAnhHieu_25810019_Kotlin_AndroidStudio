package com.example.baitapd9_25810019_leanhhieu


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ScoreScreen(scoreViewModel: ScoreViewModel = viewModel()) {
    val uiState by scoreViewModel.uiState.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            DoiBong(
                ten = "LeAnh",
                diem = uiState.diemDoi1,
                onTang = { scoreViewModel.tangDiem(true) },
                onGiam = { scoreViewModel.giamDiem(true) }
            )
            DoiBong(
                ten = "Hieu",
                diem = uiState.diemDoi2,
                onTang = { scoreViewModel.tangDiem(false) },
                onGiam = { scoreViewModel.giamDiem(false) }
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick = { scoreViewModel.reset() }) {
            Text("Reset tran dau")
        }
    }
}

@Composable
fun DoiBong(ten: String, diem: Int, onTang: () -> Unit, onGiam: () -> Unit)
{
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(ten, fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text("$diem", fontSize = 72.sp, fontWeight = FontWeight.Bold)
            Button(onClick = onTang) { Text("+", fontSize = 24.sp) }
        }
}