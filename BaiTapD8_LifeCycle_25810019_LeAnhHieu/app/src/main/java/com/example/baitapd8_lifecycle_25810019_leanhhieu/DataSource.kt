package com.example.baitapd8_lifecycle_25810019_leanhhieu

data class MonAn(
    val id: Int,
    val ten: String,
    val gia: Int,
    val hinhAnh: Int
)

object ThucDon {
    val danhSachMon = listOf(
        MonAn(1, "Suon nuong", 10000, R.drawable.suonnuong),
        MonAn(2, "Bi heo", 5000, R.drawable.biheo),
        MonAn(3, "Thit kho trung cut", 35000, R.drawable.thitkhotrungcut),
        MonAn(4, "Combo an chay", 30000, R.drawable.comboanchay),
        MonAn(5, "Ba roi", 15000, R.drawable.baroi),
        MonAn(6, "Opla", 7000, R.drawable.opla),
        MonAn(7, "Com tam full topping", 40000, R.drawable.comtam_fulltoping),
        MonAn(8, "Canh rong bien", 3000, R.drawable.canhrongbien)
    )
}