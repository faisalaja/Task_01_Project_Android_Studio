/**
 * Create by Muhammad Al Faisal on 12/14/20, 2020
 *
 * Implementation MEMBER FUNCTION
 */
class PersegiPanjang {
    var panjang = 0
    var lebar = 0

    fun insertValue(long: Int = 0, weight: Int = 0) {
        this.panjang = long
        this.lebar = weight
    }

    fun print(): String {
       return println("Total : ${panjang.times(lebar)}").toString()
    }
}

fun main() {
    var persegiPanjang = PersegiPanjang()
    persegiPanjang.insertValue(30, 20)
    persegiPanjang.print()
}