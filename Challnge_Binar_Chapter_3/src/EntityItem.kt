/**
 * Create by Muhammad Al Faisal on 12/19/20, 2020
 */
open class EntityItem : Message {

    private var items = arrayOf("Gunting", "Batu", "Kertas")
    private var pointP1 = 0
    private var pointP2 = 0

    fun print() {
        println("This is Game FIT")
        println("Please selected your item")

        for (item in items) {
            println("-> $item")
        }
        println("==================")
    }

    fun selected(p1: String) {

        if (p1.isNullOrEmpty()) {
            println("Please choice your item!")
        } else {
            val player = p1.capitalize()
            val playerCom = items.random()
            var checking = false

            for (item in items) {
                if (item.contains(player)) {
                    checking = true
                }
            }

            if (checking) {
                println("Player 1: $player")
                println("Player 2: $playerCom")

                when {
                    player.contains(playerCom) -> {
                        draw()
                    }
                    player.contains(items[0]) && playerCom.contains(items[1])
                            || player.contains(items[1]) && playerCom.contains(items[2])
                            || player.contains(items[2]) && playerCom.contains(items[0])
                    -> {
                        win("Player 2")
                        pointP2 += 1
                    }

                    player.contains(items[0]) && playerCom.contains(items[2])
                            || player.contains(items[1]) && playerCom.contains(items[0])
                            || player.contains(items[2]) && playerCom.contains(items[1])
                    -> {
                        win("Player 1")
                        pointP1 += 1
                    }
                }
            } else {
                println("Please check your value!")
            }
        }
    }

    fun getWinnerPoint() {
         if (pointP1 > pointP2) {
             println("Point Player 1 adalah $pointP1")
         } else {
             println("Point Player 2 adalah $pointP2")
        }
    }

    override fun win(player: String) {
        println("==================")
        println("$player WIN!")
        println("==================")
    }

    override fun draw() {
        println("==================")
        println("DRAW!")
        println("==================")
    }
}