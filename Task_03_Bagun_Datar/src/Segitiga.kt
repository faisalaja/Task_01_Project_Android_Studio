/**
 * Create by Muhammad Al Faisal on 12/14/20, 2020
 *
 * Implementation NASTED FUNCTION and access modifier
 */
class Segitiga {
    private var p: Double = 0.0
    private var t: Double = 0.0
    private var luas: Double = 0.0

    fun insertValue(panjang: Int, tinggi: Int) {
        p = panjang.toDouble()
        t = tinggi.toDouble()

        luas = 0.5 * p * t

        //print value
        print()
    }

    fun print() {
        println("Total Luas Segitiga adalah: $luas")
    }
}

fun main() {
    var segitiga = Segitiga()
    segitiga.insertValue(50, 10)
}