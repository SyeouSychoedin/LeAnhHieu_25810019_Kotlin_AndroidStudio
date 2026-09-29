fun main()
{
    val kiemTraDoDai: (String) -> Boolean = { chuoi -> chuoi.length >= 8}

    while (true)
    {
        print("Nhap mat khau hoac go (thoat): ")
        val matKhau = readLine() ?: ""
        if (matKhau.lowercase() == "thoat")
        {
            print("Ket thuc")
            break
        }
        val ketQua = kiemTraDoDai(matKhau)

        if (ketQua)
        {
            println("Mat khau tot")
        }
        else
        {
            println("Mat khau ngan")
        }
    }
}