package com.example.baitapd7_25810019_leanhhieu

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

object Routes {
    const val MENU = "menu"
    const val CHI_TIET = "chi_tiet/{monId}"
    fun chiTiet(id: Int) = "chi_tiet/$id"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComTamApp() {
    val navController = rememberNavController()

    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route

    val tieuDe = when (currentRoute) {
        Routes.CHI_TIET -> "Chi tiết món"
        else -> "Cơm Tấm"
    }

    val coTheQuayLai = backStackEntry != null && navController.previousBackStackEntry != null

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(tieuDe) },
                navigationIcon = {
                    if (coTheQuayLai) {
                        IconButton(onClick = { navController.navigateUp() }) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Quay lại")
                        }
                    }
                },
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Routes.MENU,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Routes.MENU) {
                MenuScreen(
                    onMonClick = { id -> navController.navigate(Routes.chiTiet(id)) }
                )
            }
            composable(
                route = Routes.CHI_TIET,
                arguments = listOf(navArgument("monId") { type = NavType.IntType })
            ) { entry ->
                val id = entry.arguments?.getInt("monId") ?: 0
                val mon = ThucDon.danhSachMon.find { it.id == id }
                ChiTietScreen(mon = mon)
            }
        }
    }
}

@Composable
fun MenuScreen(onMonClick: (Int) -> Unit) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Text("Thực đơn", style = MaterialTheme.typography.headlineMedium)
        }
        items(ThucDon.danhSachMon, key = { it.id }) { mon ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onMonClick(mon.id) }
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(mon.ten, style = MaterialTheme.typography.titleMedium)
                    Text("${mon.gia} VND", style = MaterialTheme.typography.bodyMedium)
                }
            }
        }
    }
}

@Composable
fun ChiTietScreen(mon: MonAn?) {
    var soLuong by remember { mutableIntStateOf(1) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        if (mon == null) {
            Text("Không tìm thấy món")
        } else {
            Text(mon.ten, style = MaterialTheme.typography.headlineMedium)
            Text("${mon.gia} VND", style = MaterialTheme.typography.titleMedium)
            Text(mon.moTa)

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                OutlinedButton(onClick = { if (soLuong > 1) soLuong-- }) {
                    Text("-")
                }
                Text("$soLuong", style = MaterialTheme.typography.headlineSmall)
                OutlinedButton(onClick = { soLuong++ }) {
                    Text("+")
                }
            }

            Text(
                "Tổng: ${mon.gia * soLuong} VND",
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}