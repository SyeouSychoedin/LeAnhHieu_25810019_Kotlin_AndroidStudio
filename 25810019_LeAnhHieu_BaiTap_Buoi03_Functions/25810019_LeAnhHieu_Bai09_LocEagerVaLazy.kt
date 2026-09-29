fun main() {
    val nhacCu = listOf("Guitar", "Piano", "Violin", "Drum", "Flute", "Saxophone", "Trumpet", "Cello")
    val chuCai = "P"

    val ketQuaThuong = nhacCu.filter { it.startsWith(chuCai) }
    println("Loc thuong: $ketQuaThuong")

    val ketQuaSequence = nhacCu.asSequence().filter { it.startsWith(chuCai) }.toList()
    println("Loc qua Sequence: $ketQuaSequence")}