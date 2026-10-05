package com.example.lesson4_25810019_leanhhieu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lesson4_25810019_leanhhieu.ui.theme.Lesson4_25810019_LeAnhHieuTheme


class DanhThiep : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManHinhCaNhan()
        }
    }

    @Composable
    fun ManHinhCaNhan() {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Anh dai dien",
                modifier = Modifier.size(200.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Le Anh Hieu",
                        fontSize = 50.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "25810019",
                        fontSize = 35.sp
            )
        }
    }
}


