
import java.util.Scanner

// Clase para representar un contacto
data class Contacto(val nombre: String, val telefono: String, val correo: String)

fun main() {
    val scanner = Scanner(System.`in`)
    val listaDeContactos = mutableListOf<Contacto>()

    var opcion: Int

    do {
        println("1. Agregar un nuevo contacto")
        println("2. Mostrar la lista de contactos")
        println("3. Buscar un contacto por nombre")
        println("4. Eliminar un contacto por nombre")
        println("5. Salir del programa")
        print("Seleccione una opción: ")

        opcion = scanner.nextInt()

        when (opcion) {
            1 -> {
                // Agregar un nuevo contacto
                println("Agregar un nuevo contacto:")
                print("Nombre: ")
                val nombre = scanner.next()
                print("Número de teléfono: ")
                val telefono = scanner.next()
                print("Correo electrónico: ")
                val correo = scanner.next()

                val nuevoContacto = Contacto(nombre, telefono, correo)
                listaDeContactos.add(nuevoContacto)
                println("Contacto agregado correctamente.")
            }
            2 -> {
                // Mostrar la lista de contactos
                if (listaDeContactos.isEmpty()) {
                    println("La lista de contactos está vacía.")
                } else {
                    println("Lista de Contactos:")
                    for (contacto in listaDeContactos) {
                        println("Nombre: ${contacto.nombre}")
                        println("Teléfono: ${contacto.telefono}")
                        println("Correo electrónico: ${contacto.correo}")
                        println("-----------------------------")
                    }
                }
            }
            3 -> {
                // Buscar un contacto por nombre
                print("Ingrese el nombre del contacto a buscar: ")
                val nombreBuscado = scanner.next()
                val contactosEncontrados = listaDeContactos.filter { it.nombre.equals(nombreBuscado, ignoreCase = true) }

                if (contactosEncontrados.isEmpty()) {
                    println("No se encontraron contactos con el nombre \"$nombreBuscado\".")
                } else {
                    println("Contactos encontrados:")
                    for (contacto in contactosEncontrados) {
                        println("Nombre: ${contacto.nombre}")
                        println("Teléfono: ${contacto.telefono}")
                        println("Correo electrónico: ${contacto.correo}")
                        println("-----------------------------")
                    }
                }
            }
            4 -> {
                // Eliminar un contacto por nombre
                print("Ingrese el nombre del contacto a eliminar: ")
                val nombreEliminar = scanner.next()
                val contactosAEliminar = listaDeContactos.filter { it.nombre.equals(nombreEliminar, ignoreCase = true) }

                if (contactosAEliminar.isEmpty()) {
                    println("No se encontraron contactos con el nombre \"$nombreEliminar\" para eliminar.")
                } else {
                    listaDeContactos.removeAll(contactosAEliminar)
                    println("Se eliminaron ${contactosAEliminar.size} contactos con el nombre \"$nombreEliminar\".")
                }
            }
            5 -> {
                // Salir del programa
                println("Saliendo del programa. ¡Hasta luego!")
            }
            else -> println("Opción no válida. Intente de nuevo.")
        }
    } while (opcion != 5)
}
