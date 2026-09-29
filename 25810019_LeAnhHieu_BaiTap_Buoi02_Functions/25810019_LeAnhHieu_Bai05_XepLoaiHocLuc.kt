fun main() {
    val diemTrungBinh: Double = 6.7

    val xepLoai: String = when (diemTrungBinh)
    {
        in 8.0..10.0 -> "Xuat sac"
        in 6.5..7.9 -> "Gioi"
        in 5.0..6.4 -> "Kha"
        in 3.5..4.9 -> "Trung Binh"
        else -> "Yeu"
    }

    println("Diem trung binh: $diemTrungBinh")
    println("Xep loai hoc luc: $xepLoai")
}