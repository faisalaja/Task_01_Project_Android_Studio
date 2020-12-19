/**
 * Create by Muhammad Al Faisal on 12/18/20, 2020
 */
class Burung : Binatang{
    constructor(name: String, jenisKelamin: String, warnaBulu: String) : super(name, jenisKelamin, warnaBulu)

    override fun berlari() {
        super.berlari()

        println("Kerana spasies campuran")
    }
}

fun main() {
    print("Massukkan nama burung: ")
    val name = readLine().toString()
    print("Massukkan jenis kelamin burung: ")
    val jenisKelamin =  readLine().toString()
    print("Massukkan warna burung: ")
    val warna = readLine().toString()
    println("")

    val burung = Burung(
        name,
        jenisKelamin,
        warna
    )

    if (burung.name.equals("puyuh") || burung.name.equals("Puyuh")){
        burung.berlari()
    } else {
        burung.terbang()
    }
}