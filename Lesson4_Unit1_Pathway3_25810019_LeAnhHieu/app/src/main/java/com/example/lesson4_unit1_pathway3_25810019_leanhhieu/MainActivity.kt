package com.example.lesson4_unit1_pathway3_25810019_leanhhieu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lesson4_unit1_pathway3_25810019_leanhhieu.ui.theme.Lesson4_Unit1_Pathway3_25810019_LeAnhHieuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lesson4_Unit1_Pathway3_25810019_LeAnhHieuTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ThiepHinh(
                        loiChuc = stringResource(R.string.happy_birthday_text),
                        nguoiGui = stringResource(R.string.signature_text)
                    )
                }
            }
        }
    }
}

@Composable
fun ChuThiep(loiChuc: String, nguoiGui: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = loiChuc,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = nguoiGui,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(end = 16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun ThiepHinh(loiChuc: String, nguoiGui: String, modifier: Modifier = Modifier) {
    Box(modifier) {
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 1F
        )
        ChuThiep(
            loiChuc = loiChuc,
            nguoiGui = nguoiGui,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = false)
@Composable
private fun XemTruocThiep() {
    Lesson4_Unit1_Pathway3_25810019_LeAnhHieuTheme {
        ThiepHinh(
            loiChuc = stringResource(R.string.happy_birthday_text),
            nguoiGui = stringResource(R.string.signature_text)
        )
    }
}