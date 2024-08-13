package Zoo

abstract class Animal {
    abstract val nombre: String
    abstract val tipo: String

    fun describir() {
        println("Este es un $tipo llamado $nombre.")
    }
}