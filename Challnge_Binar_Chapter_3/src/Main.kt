import kotlin.random.Random

/**
 * Create by Muhammad Al Faisal on 12/19/20, 2020
 */

class Main: GameAction() {

    fun startGame(){
        start()
    }

    override fun start() {
        EntityItem().print()
        insertValue()
    }

    override fun end() {
        println("Terimakasih Sudah bermain!")
        EntityItem().getWinnerPoint()
    }

    override fun insertValue() {
        print("Silahkan Masukkan Pilihan anda: ")
        EntityItem().selected(readLine().toString())
        if (readLine().isNullOrBlank() || readLine().isNullOrEmpty()){
            insertValue()
        } else {
            again()
        }
    }

    override fun again() {
        println("")
        print("Apakah ingin mencoba kembali [Yes/No]: ")

        if (readLine().toString().capitalize().contains("Yes")){
            insertValue()
        }else{
            end()
        }
    }
}

fun main() {
    Main().startGame()
}
