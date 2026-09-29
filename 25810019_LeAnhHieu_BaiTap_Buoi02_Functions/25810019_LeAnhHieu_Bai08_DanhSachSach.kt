fun main(){
    val danhSachSach = mutableListOf("Toan","Ly","Hoa","Van","Anh")
    println("Danh sach ban dau: $danhSachSach")

    danhSachSach.add("Su")
    println("Them su vao $danhSachSach")

    danhSachSach.removeAt(danhSachSach.size - 1)
    println("Sau khi xoa cuon dong cuoi $danhSachSach")

    danhSachSach.sort()
    println("Danh sach sau khi sap xep $danhSachSach")
}