fun ghiNhatKyCoUnit(hanhDong: String): Unit {
    println("He thong: $hanhDong")
}

fun ghiNhatKyKhongUnit(hanhDong: String) {
    println("He thong: $hanhDong")
}

fun main() {
    ghiNhatKyCoUnit("Nguoi dung dang nhap")
    ghiNhatKyKhongUnit("Nguoi dung dang xuat")
}