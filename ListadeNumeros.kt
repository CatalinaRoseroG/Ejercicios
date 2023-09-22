import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val listaDeNumeros = mutableListOf<Double>()

    while (true) {
        println("1. Agregar números a la lista")
        println("2. Calcular la suma de los numeros en la lista")
        println("3. Calcular el promedio de los numeros en la lista")
        println("4. Encontrar los números pares en la lista")
        println("5. Elevar al cuadrado todos los numeros de la lista")
        println("6. Salir del programa")
        print("Seleccione una opción: ")

        when (scanner.nextInt()) {
            1 -> {
                // Agregar un número
                print("Ingrese un número: ")
                val numero = scanner.nextDouble()
                listaDeNumeros.add(numero)
                println("Número agregado correctamente.")
            }
            2 -> {
                // Calcular la suma
                val suma = listaDeNumeros.sum()
                println("La suma de los números en la lista es: $suma")
            }
            3 -> {
                // Calcular el promedio
                val promedio = if (listaDeNumeros.isNotEmpty()) listaDeNumeros.average() else 0.0
                println("El promedio de los números en la lista es: $promedio")
            }
            4 -> {
                // Encontrar números pares
                val numerosPares = listaDeNumeros.filter { it % 2 == 0.0 }
                println("Números pares en la lista: $numerosPares")
            }
            5 -> {
                // Elevar al cuadrado
                val numerosCuadrado = listaDeNumeros.map { it * it }
                println("Números elevados al cuadrado: $numerosCuadrado")
            }
            6 -> {
                // Salir del programa
                println("Saliste del programa")
                return
            }
            else -> println("Opción no válida. Intente de nuevo.")
        }
    }
}

