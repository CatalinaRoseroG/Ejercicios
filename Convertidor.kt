import java.util.Scanner

// Función para realizar la conversión entre monedas

fun convertirMoneda(cantidad: Double, monedaOrigen: String): Double {
    val tasaDolarAEuro = 0.93


    return if (monedaOrigen == "USD") {
        cantidad * tasaDolarAEuro
    } else if (monedaOrigen == "EUR") {
        cantidad / tasaDolarAEuro
    } else {
        println("Moneda de origen no válida.")
        cantidad
    }
}

fun main() {
    val scanner = Scanner(System.`in`)


    // Solicitar la cantidad a convertir
    print("Ingrese la cantidad a convertir: ")
    val cantidad = scanner.nextDouble()


    // Bucle para elegir la moneda de origen
    var monedaOrigen: String
    while (true) {
        println("Elija la moneda de origen:")
        println("1. USD (Dólares)")
        println("2. EUR (Euros)")
        print("Ingrese el número correspondiente a la moneda de origen: ")
        val opcionMonedaOrigen = scanner.nextInt()


        if (opcionMonedaOrigen == 1) {
            monedaOrigen = "USD"
            break
        } else if (opcionMonedaOrigen == 2) {
            monedaOrigen = "EUR"
            break
        } else {
            println("Opción no válida. Intente de nuevo.")
        }
    }


    // Llamar a la función para realizar la conversión
    val resultado = convertirMoneda(cantidad, monedaOrigen)


    // Determinar la moneda de destino automáticamente
    val monedaDestino = if (monedaOrigen == "USD") "EUR" else "USD"


    // Mostrar el resultado
    println("Resultado de la conversión: $cantidad $monedaOrigen = $resultado $monedaDestino")


    scanner.close()
}

