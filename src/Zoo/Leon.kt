package Zoo

class Leon(override val nombre: String) : Animal(), ComportamientoAnimal {
    override val tipo: String = "León"

    override fun comer() {
        println("$nombre está cazando y comiendo carne.")
    }

    override fun dormir() {
        println("$nombre está durmiendo en su cueva.")
    }

    override fun hacerSonido() {
        println("$nombre está rugiendo fuertemente.")
    }
}
