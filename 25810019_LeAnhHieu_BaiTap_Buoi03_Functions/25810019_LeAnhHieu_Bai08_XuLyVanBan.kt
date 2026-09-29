fun xuLyVanBan(chuoi: String, hamXuLy: (String) -> String): String {
    return hamXuLy(chuoi)
}

fun themTienTo(s: String): String {
    return "Xin chao: $s"
}

fun main() {
    val kq1 = xuLyVanBan("Hieu", { s -> s.uppercase() })
    println(kq1)

    val kq2 = xuLyVanBan("Hieu", ::themTienTo)
    println(kq2)

    val kq3 = xuLyVanBan("Hieu") { s -> s.reversed() }
    println(kq3)
}