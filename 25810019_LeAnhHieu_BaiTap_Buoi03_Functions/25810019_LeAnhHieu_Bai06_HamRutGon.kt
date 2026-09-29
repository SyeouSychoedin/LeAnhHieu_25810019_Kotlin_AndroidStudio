fun binhPhuongDayDu(x: Int): Int {
    return x * x
}

fun binhPhuongRutGon(x: Int) = x * x

fun chuViHinhVuongDayDu(canh: Int): Int {
    return canh * 4
}

fun chuViHinhVuongRutGon(canh: Int) = canh * 4

fun laSoChanDayDu(x: Int): Boolean {
    return x % 2 == 0
}

fun laSoChanRutGon(x: Int) = x % 2 == 0

fun main() {
    println("Binh phuong:")
    println("Day du: ${binhPhuongDayDu(5)}")
    println("Rut gon: ${binhPhuongRutGon(5)}")

    println("\nChu vi hinh vuong:")
    println("Day du: ${chuViHinhVuongDayDu(4)}")
    println("Rut gon: ${chuViHinhVuongRutGon(4)}")

    println("\nKiem tra so chan:")
    println("Day du: ${laSoChanDayDu(7)}")
    println("Rut gon: ${laSoChanRutGon(7)}")
}