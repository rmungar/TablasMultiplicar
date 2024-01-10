
/**
 * Solicita un número entero en un rango.
 *
 * @param min Int - valor mínimo
 * @param max Int - valor máximo
 *
 * @return Int - número entero válido dentro del rango especificado
 */
fun  pedirNumero(min: Int, max:Int): Int {
    var numero = 0
    var valido = false
    while (!valido) {
        try {
            print("Introduzca un número entre 1 y 100: ")
            numero = readln().toInt()
            if (numero < min || max < numero) throw Exception("Yo creo que te has colado crack")
            else {
                valido = true
            }
        } catch (_: Exception) {
            println("**Error** Número no válido (pulse ENTER para continuar...)")
        }
    }
    return numero
}
/**
 * Se encarga de crear la tabla con el numero ingresado y un array de tamaño predefinido.
 *
 * @param numero Int - valor ingresado por el usuario
 *
 */
fun tablas(vararg numero: Int) {
    val tabla = Array(10) {i -> i + 1} //{ i -> "$i -> $i x $num = ${num * i}"}
    for (i in tabla) println("$i -> ${numero[0]} x $i = ${i * numero[0]}")
}


/**
 * Realiza una pregunta para contestar con s/si ó n/no
 *
 * @param text String - Texto de la pregunta
 *
 * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
 */
fun preguntar(text: String): Boolean {
    val continuar: Boolean
    when (text) {
        "s" -> continuar = true
        "n" -> {
            continuar = false
        }
        else -> {
            println("**Error** Respuesta no válida (pulse ENTER para continuar...)")
            continuar = true
        }
    }
    return continuar
}






fun main() {
    val min = 0
    val max = 100
    var continuar = true
    while (continuar){
        val numero = pedirNumero(min, max)
        tablas(numero)
        print("¿Desea generar otra tabla de multiplicación? (s/n) ")
        val text = readln()
        continuar = preguntar(text)
    }

}

