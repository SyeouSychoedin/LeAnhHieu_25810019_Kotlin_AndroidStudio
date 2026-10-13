package com.example.baitapd8_lifecycle_25810019_leanhhieu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MonAnBox(
    mon: MonAn,
    soLuong: Int,
    onTang: () -> Unit,
    onGiam: () -> Unit
) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = mon.hinhAnh),
                contentDescription = mon.ten,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(80.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(mon.ten, style = MaterialTheme.typography.titleMedium)
                Text("${mon.gia} VND", style = MaterialTheme.typography.bodyMedium)
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Button(
                    onClick = onGiam,
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.size(36.dp)
                ) {
                    Text("-", fontSize = 18.sp)
                }
                Text(
                    "$soLuong",
                    modifier = Modifier.padding(horizontal = 10.dp),
                    fontSize = 18.sp
                )
                Button(
                    onClick = onTang,
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.size(36.dp)
                ) {
                    Text("+", fontSize = 18.sp)
                }
            }
        }
    }
}