fun main(args: Array<String>) {
    // Input angka
    println("Masukkan beberapa bilangan, dipisahkan dengan spasi:")
    val input = readLine()

    // Konversi string menjadi angka
    val numbers = input?.split(" ")?.map { it.toDouble() } ?: emptyList()

    // Menghitung rata-rata dan waktu menghitung
    val startTime = System.currentTimeMillis()
    val sum = numbers.sum()
    val average = sum / numbers.size
    val endTime = System.currentTimeMillis()

    // Print hasil dan waktu menghitung
    println("Jumlah rata-rata: $average")
    println("Waktu yang dibutuhkan: ${endTime - startTime} ms")
}