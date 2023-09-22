//calculadora

import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)

    print("Ingresa un numero: ")
    val numero1 = scanner.nextInt()

    print("Ingresa un numero: ")
    val numero2 = scanner.nextInt()


    var opcion:Int

    while(true) {
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")


        print("Ingrese el número correspondiente a la operación que desea realizar: ")
        opcion = scanner.nextInt()


        if(opcion in 1..4){
            break
        }else{
            println("Opcion no valida. Intenta de nuevo")
        }
    }

    val resultado = when(opcion){


        1 -> sumar(numero1, numero2)
        2 -> resta(numero1, numero2)
        3 -> multiplicar(numero1, numero2)
        4 -> division(numero1, numero2)
        else -> throw IllegalArgumentException("Opción no válida")
    }

    println("El resultado de la operación es: $resultado")

    scanner.close()

}

fun sumar(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun resta(num1: Int, num2: Int): Int {
    return num1 - num2
}

fun multiplicar(num1: Int, num2: Int): Int {
    return num1 * num2
}

fun division (num1: Int, num2: Int): Double {
    if (num2 != 0) {
        return num1.toDouble() / num2.toDouble()
    }else{
        throw ArithmeticException("No se puede dividir por cero.")
    }
}




