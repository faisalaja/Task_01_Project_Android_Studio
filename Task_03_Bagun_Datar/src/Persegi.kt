/**
 * Create by Muhammad Al Faisal on 12/14/20, 2020
 *
 * Implemantation TOP function
 */
class Persegi {
    var sisi = 0

    fun run() {
        println("BANGUN DATAR - PERSEGI")
        print("Masukkan Nilai sisi : ")
        readLine()?.toInt()?.let {
            sisi = it
        }
        println("Hasil Persegi Adalah: ${sisi.toDouble() * sisi.toDouble()}")
        println(">>>>>>>>>>>>>END<<<<<<<<<<<<<<")
    }
}

fun main() {
    Persegi().run()
}