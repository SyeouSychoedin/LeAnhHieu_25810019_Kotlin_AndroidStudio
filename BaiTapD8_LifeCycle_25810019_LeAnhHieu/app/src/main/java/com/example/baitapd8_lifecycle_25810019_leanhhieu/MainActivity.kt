package com.example.baitapd8_lifecycle_25810019_leanhhieu

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                ManHinhDatMon()
            }
        }
    }
}

@Composable
fun ManHinhDatMon() {
    val context = LocalContext.current
    var soLuongs by rememberSaveable {
        mutableStateOf(List(ThucDon.danhSachMon.size) { 0 })
    }
    // Tính tổng tiền
    val tongTien = ThucDon.danhSachMon.mapIndexed { index, mon ->
        soLuongs[index] * mon.gia
    }.sum()

    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            itemsIndexed(ThucDon.danhSachMon) { index, mon ->
                MonAnBox(
                    mon = mon,
                    soLuong = soLuongs[index],
                    onTang = {
                        soLuongs = soLuongs.toMutableList().apply { this[index]++ }
                    },
                    onGiam = {
                        if (soLuongs[index] > 0) {
                            soLuongs = soLuongs.toMutableList().apply { this[index]-- }
                        }
                    }
                )
            }
        }
        Surface(
            color = MaterialTheme.colorScheme.surfaceVariant,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Tong tien: $tongTien VND",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.weight(1f)
                )
                Button(
                    onClick = {
                        soLuongs = List(ThucDon.danhSachMon.size) { 0 }
                        Toast.makeText(context, "Thanh Toán Xong", Toast.LENGTH_SHORT).show()
                    }
                ) {
                    Text("Thanh toan")
                }
            }
        }
    }
}