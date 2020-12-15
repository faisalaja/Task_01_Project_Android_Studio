/**
 * Create by Muhammad Al Faisal on 12/14/20, 2020
 */
class Persegi {
    fun print() {
        var sisi = 0

        println("BANGUN DATAR - PERSEGI\n")
        print("Masukkan Nilai sisi : ")
        readLine()?.toInt()?.let {
            sisi = it
        }
        println("Hasil Persegi Adalah: ${sisi.toDouble() * sisi.toDouble()}")
    }
}