/**
 * Create by Muhammad Al Faisal on 12/18/20, 2020
 */
class Ikan(name: String, jenisKelamin:String): Binatang(name, jenisKelamin){

    override fun beranang() {
        super.beranang()

        println("Hidup di air tawar atau asin")
    }
}

fun main() {

    print("Masukkan nama ikan: ")
    val name = readLine().toString()
    print("Masukkan jenis kelamin: ")
    val jenisKelamin = readLine().toString()
    val ikan = Ikan(name, jenisKelamin)

    ikan.beranang()
}

