fun main(){
    var soThuNhat = 0
    var soThuHai = 1
    var chiSo = 0

    println("Cac so Fibonacci nho hon 100:")

    for (i in 0..100) {
        if (soThuNhat >= 100) break

        println("Vi tri $chiSo: $soThuNhat")

        val soTiepTheo = soThuNhat + soThuHai
        soThuNhat = soThuHai
        soThuHai = soTiepTheo
        chiSo++
    }
}