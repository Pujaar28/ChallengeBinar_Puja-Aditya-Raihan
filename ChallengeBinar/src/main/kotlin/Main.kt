fun main(args: Array<String>) {

do{
    println("=========================")
    println("Selamat Datang Di GAMSUIT")
    println("=========================")
    println("1. Bermain")
    println("2. Keluar")
    print("Pilihan: ")
    val a = readLine()?.toInt()
    if (a == 1 ){
        playGame()
    }else if (a!!<2||a!=1){
        println("GoodBye")
        return
    }else{
        println("Harap di isi dengan benar")
    }
}while (a!! <2 || a!=1)

}

fun playGame() {
    val gameplay = Gameplay()
    println("=========================")
    println("Selamat Datang Di GAMSUIT")
    println("=========================")
    println("Pilih Batu,Gunting,Kertas")
        print("Masukan pemain 1:  ")
        val player1 = readLine()
        print("Masukan pemain 2:  ")
        val player2 = readLine()
        if (player1 != null && player2 != null) {
            gameplay.regulation(player1.toString(), player2.toString())
        } else {
            println("tolong diisi")
        }
    }



