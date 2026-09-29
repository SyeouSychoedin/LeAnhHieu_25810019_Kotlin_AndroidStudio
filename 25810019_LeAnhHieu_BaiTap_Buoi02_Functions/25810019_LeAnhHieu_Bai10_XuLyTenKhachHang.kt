fun xuLyTenKhachHang(ten: String?) {
    println("Do dai ten (safe call): ${ten?.length}")

    val tenHienThi = ten ?: "Khach vang lai"
    println("Ten hien thi (Elvis): $tenHienThi")

    val doDaiBaoBuoc = ten!!.length
    println("Do dai ten (!!): $doDaiBaoBuoc")
}

fun main() {
    println("Truong hop ten co gia tri:")
    xuLyTenKhachHang("Le Anh Hieu")

    println("\nTruong hop ten bi null:")
    xuLyTenKhachHang(null)
}