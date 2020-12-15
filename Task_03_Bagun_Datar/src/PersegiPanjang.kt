/**
 * Create by Muhammad Al Faisal on 12/14/20, 2020
 */
class PersegiPanjang {
    var panjang = 0
    var lebar = 0

    fun print() {
        println("")
        println("BANGUN DATAR - PERSEGI")
        print("Massukkan Nilai Panjang: ")
        readLine()?.toInt()?.let {
            panjang = it
        }
        print("Massukkan Nilai Lebar: ")
        readLine()?.toInt()?.let {
            lebar = it
        }

        print(panjang.compareTo(lebar))
    }
}