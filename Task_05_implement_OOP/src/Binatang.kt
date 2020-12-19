/**
 * Create by Muhammad Al Faisal on 12/18/20, 2020
 */
open class Binatang(var name: String? = "", var jenisKelamin: String? = "") : Sifat {
    private var kelamin: String = ""
        set(value) {
            value.toLowerCase()
            field = if (value == "jantan" || value == "betina") value else "Mempunyai 2 Jenis Kelamin"
        }

    init {
        jenisKelamin?.let { kelamin = it }
        println("Nama hewan: ${name?.toUpperCase()}\nJenis Kelamin: $kelamin")
    }

    constructor(name: String, jenisKelamin: String, warnaBulu: String) : this(name, jenisKelamin) {
        println("Warna Bulu: $warnaBulu")
    }

    constructor(name: String?, jenisKelamin: String?, warnaBulu: String?, jenis: String?) : this(name, jenisKelamin) {
        println("Warna Bulu: $warnaBulu\nJenis Binatang: $jenis")
    }

    override fun berlari() {
        println("Beraktivitas dengan berlari")
    }

    override fun beranang() {
        println("Beraktivitas dengan berenang")
    }

    override fun terbang() {
        println("Beraktivitas dengan terbang")
    }
}

