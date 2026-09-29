fun main (){
    val soLuong: Int = 5
    val donGia: Double = 15000.0

    val tienHang = soLuong.toDouble() * donGia
    val thue = tienHang * 0.08
    val tongTien = tienHang + thue

    println("So luong: $soLuong cai/loai")
    println("Don gia: $donGia VND")
    println("Tien hang: $tienHang VND")
    println("Thue 8%: $thue VND")
    println("Tong tien phai tra: $tongTien VND")
}