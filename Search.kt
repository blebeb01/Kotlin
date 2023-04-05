import java.util.Scanner

fun main() {
    val list = ArrayList<Int>()

    //Input pencarian
    val reader = Scanner(System.`in`)
    print("Masukkan bilangan: ")
    val input: Int = reader.nextInt()

    //Memasukkan elemen angka 1 sampai 1000000 ke list
    val startTime = System.currentTimeMillis()
    for(i in 1..1000000) {
        list.add(i)
    }

    //Hasil
    if(input in list) {
        println("Bilangan $input ada.")
    }
    else {
        println("Bilangan $input tidak ada.")
    }
    val endTime = System.currentTimeMillis()

    //Waktu yang dibutuhkan
    println("Waktu yang dibutuhkan: ${endTime - startTime} ms.")
}