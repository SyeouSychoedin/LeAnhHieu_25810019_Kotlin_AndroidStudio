fun main() {
    val canNang: Double = 100.0
    val chieuCao: Double = 1.7

    val bmi = canNang / chieuCao
    val bmiFormat = String.format("%.2f", bmi).toDouble()

    val phanLoai: String = if (bmi < 18.5) {
        "Gay"
    } else if (bmi < 25.0) {
        "Binh thuong"
    } else if (bmi < 30.0) {
        "Thua can"
    } else {
        "Beo phi"
    }

    println("Chi so BMI: $bmiFormat")
    println("Loai: $phanLoai")
}