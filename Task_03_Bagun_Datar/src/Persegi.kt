/**
 * Create by Muhammad Al Faisal on 12/14/20, 2020
 */
class Persegi {
    fun print() {
        var sisi = 0
        print("Masukkan Nilai sisi : ")
        sisi = readLine()!!.toInt()
        println("Hasil Persegi Adalah: ${sisi.toDouble() * sisi.toDouble()}")
    }
}