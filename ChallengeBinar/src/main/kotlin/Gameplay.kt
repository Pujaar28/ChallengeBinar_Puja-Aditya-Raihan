class Gameplay: AbstractGameplay() {
    override fun regulation(player1: String, player2: String) {
        val pilihan = arrayOf("batu", "gunting", "kertas")
            if (player1 == pilihan[0] && player2 == pilihan[0]) {
                println("Hasil Seri")

            } else if (player1 == pilihan[1] && player2 == pilihan[1]) {
                println("Hasil Seri")

            } else if (player1 == pilihan[2] && player2 == pilihan[2]) {
                println("Hasil Seri")

            } else if (player1 == pilihan[0] && player2 == pilihan[1]) {
                println("Pemain 1 Menang")

            } else if (player1 == pilihan[1] && player2 == pilihan[2]) {
                println("Pemain 1 Menang")

            } else if (player1 == pilihan[2] && player2 == pilihan[0]) {
                println("Pemain 1 Menang")

            } else if (player1 == pilihan[2] && player2 == pilihan[1]) {
                println("Pemain 2 Menang")

            } else if (player1 == pilihan[1] && player2 == pilihan[0]) {
                println("Pemain 2 Menang")

            } else if (player1 == pilihan[0] && player2 == pilihan[2]) {
                println("pemain 2 menang")

            } else {
                println("Pilih Batu,Gunting,Kertas")
            }
        }
    }

