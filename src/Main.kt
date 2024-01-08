/**
 * Solicita un número entero en un rango.
 *
 * @param min Int - valor mínimo
 * @param max Int - valor máximo
 *
 * @return Int - número entero válido dentro del rango especificado
 */
fun  pedirNumero(): Int {
    var numero = 0
    var valido = false
    while (!valido) {
        try {
            print("Introduzca un número entre 1 y 100: ")
            numero = readln().toInt()
            if (numero < 0 || 100 < numero) throw Exception("Yo creo que te has colado crack")
            else {
                valido = true
            }
        } catch (_: Exception) {
            println("**Error** Número no válido (pulse ENTER para continuar...)")
        }
    }
    return numero
}

fun tablas(vararg numero: Int) {
    val tabla = IntArray(10) {i ->  i + 1}
    for (i in tabla) {
        println("$i -> $numero x $i = ${numero * i}")
    }
}


/**
 * Realiza una pregunta para contestar con s/si ó n/no
 *
 * @param text String - Texto de la pregunta
 *
 * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
 */
fun pregunta






fun main() {
    tablas()
}

