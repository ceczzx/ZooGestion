import Zoo.Leon
import Zoo.Elefante

fun main() {
    val leon = Leon("Simba")
    val elefante = Elefante("Dumbo")

    leon.describir()
    leon.comer()
    leon.dormir()
    leon.hacerSonido()

    println()

    elefante.describir()
    elefante.comer()
    elefante.dormir()
    elefante.hacerSonido()
}
