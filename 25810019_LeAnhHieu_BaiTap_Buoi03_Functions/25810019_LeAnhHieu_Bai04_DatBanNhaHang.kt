fun datBan(tenKhachHang: String, soLuongKhach: Int, loaiBan: String = "ban thuong")
{
    println("--------------------------")
    println("Khach hang: $tenKhachHang")
    println("So luong khach: $soLuongKhach")
    println("Loaiban: $loaiBan")
    println("--------------------------")
}

fun main(){
    datBan("Le Anh Hieu", 4)
    datBan("ABC", 2,"ban vip")
    datBan(tenKhachHang = "XYZ", soLuongKhach = 6, loaiBan = "ngoai troi")
}