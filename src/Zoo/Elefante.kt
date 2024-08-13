package Zoo

class Elefante(override val nombre: String) : Animal(), ComportamientoAnimal {
    override val tipo: String = "Elefante"

    override fun comer() {
        println("$nombre está comiendo hierba.")
    }

    override fun dormir() {
        println("$nombre está durmiendo de pie.")
    }

    override fun hacerSonido() {
        println("$nombre está trompeteando.")
    }
}
