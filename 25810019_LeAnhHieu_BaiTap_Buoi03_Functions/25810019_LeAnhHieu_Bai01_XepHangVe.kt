fun main()
{
    print("Nhap so tuoi: ")
    val tuoi = readLine()?.toIntOrNull() ?:0
    val loaiVe = if (tuoi < 12)
    {
        "Ve tre em"
    }
    else if (tuoi < 60)
    {
        "Ve nguoi lon"
    }
    else
    {
        "Ve cao tuoi"
    }
    println("Loai ve su dung: $loaiVe")

    println("Phim cho ve: ")
    if (tuoi >= 8)
    {
        println("Dao Ky Quai")
        println("Ac Mong Ma")
    }
    if (tuoi >= 15)
    {
        println("Giao duc gioi tinh")
        println("Tinh yeu cap 3")
    }
    if (tuoi >= 18)
    {
        println("Phim hai nguoi lon")
    }
    if (tuoi<8)
    {
        println("Duoi tuoi khong duoc xem")
    }
}