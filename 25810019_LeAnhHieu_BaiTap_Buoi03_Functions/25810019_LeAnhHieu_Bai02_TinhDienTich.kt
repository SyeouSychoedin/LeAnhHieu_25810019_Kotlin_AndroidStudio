fun bai02() {
    fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
        return chieuDai * chieuRong
    }

    val dienTich1 = tinhDienTich(5.0, 3.0)
    val dienTich2 = tinhDienTich(7.5, 4.2)

    println("Dien tich hinh chu nhat 1: $dienTich1")
    println("Dien tich hinh chu nhat 2: $dienTich2")
}