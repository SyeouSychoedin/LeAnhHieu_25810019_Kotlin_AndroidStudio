package com.example.baitapd6_25810019_leanhhieu

data class MonAn(
    val tenMon: Int,
    val soLuong: Int,
    val hinhAnh: Int
)

object DuLieu {
    val danhSachMon = listOf(
        MonAn(R.string.noodle, 58, R.drawable.noodles),
        MonAn(R.string.salad, 121, R.drawable.salad),
        MonAn(R.string.simplecook, 78, R.drawable.simplecook),
        MonAn(R.string.ultrasalad, 118, R.drawable.ultrasalad),
        MonAn(R.string.ultrasaladv2, 423, R.drawable.ultrasaladv2),
        MonAn(R.string.yolkbread, 92, R.drawable.yolkbread)
    )
}
