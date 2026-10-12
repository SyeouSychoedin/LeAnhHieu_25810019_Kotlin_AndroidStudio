package com.example.baitapd7_25810019_leanhhieu
data class MonAn(
    val id: Int,
    val ten: String,
    val gia: Int,
    val moTa: String
)

object ThucDon {
    val danhSachMon = listOf(
        MonAn(1, "Cơm Tấm Sườn", 45000, "Cơm tấm ăn kèm sườn nướng, bì, chả, và nước mắm."),
        MonAn(2, "Cơm Tấm Sườn Bì", 50000, "Cơm tấm với sườn nướng và bì heo."),
        MonAn(3, "Cơm Tấm Sườn Chả", 52000, "Cơm tấm với sườn nướng và chả trứng."),
        MonAn(4, "Cơm Tấm Đặc Biệt", 60000, "Cơm tấm đầy đủ sườn, bì, chả, và trứng."),
        MonAn(5, "Cơm Tấm Gà Nướng", 48000, "Cơm tấm ăn kèm gà nướng sả."),
        MonAn(6, "Cơm Tấm Chay", 40000, "Cơm tấm với đậu hũ, nấm, và rau củ.")
    )
}