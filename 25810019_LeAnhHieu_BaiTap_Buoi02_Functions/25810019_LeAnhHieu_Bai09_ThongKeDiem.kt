fun main() {
    val diemSo = arrayOf(8.5, 7.0, 9.0, 5.5, 6.0, 10.0, 4.5, 8.0, 7.5, 6.5)

    var tongDiem = 0.0
    var diemCaoNhat = diemSo[0]
    var diemThapNhat = diemSo[0]

    for (diem in diemSo) {
        tongDiem += diem

        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }

        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }

    val diemTrungBinh = tongDiem / diemSo.size

    println("Diem trung binh: $diemTrungBinh")
    println("Diem cao nhat: $diemCaoNhat")
    println("Diem thap nhat: $diemThapNhat")
}