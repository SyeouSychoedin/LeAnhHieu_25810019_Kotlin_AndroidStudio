fun main() {
    val soNguyen = listOf(1, 2, 3, 4, 5)
    val nhanDoi = soNguyen.map { it * 2 }
    println("Danh sach sau khi nhan doi: $nhanDoi")

    val danhSachCon = listOf(
        listOf(1, 2, 3),
        listOf(4, 5),
        listOf(6, 7, 8)
    )
    val danhSachPhang = danhSachCon.flatten()
    println("Danh sach sau khi gop phang: $danhSachPhang")
}