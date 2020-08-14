package data

data class GadoGado(val quantity: Int ) {

   operator fun plus (gadogado: GadoGado): GadoGado {
        return GadoGado(this.quantity + gadogado.quantity)
    }

    operator fun minus(gadogado: GadoGado): GadoGado {
        return GadoGado(this.quantity - gadogado.quantity)
    }
}