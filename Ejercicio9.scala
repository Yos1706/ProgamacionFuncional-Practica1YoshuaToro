import scala.annotation.tailrec

object Ejercicio9 {

    def segundoMayorDigito(n: Int): Int = {
        @tailrec
        def obtenerMascaras(num: Int, mask: Int): Int = {
            if num == 0 then mask
            else obtenerMascaras(num / 10, mask | (1 << (num % 10)))
        }
        @tailrec
        def encontrarSegundo(actual: Int, mayor: Int, segundo: Int, mask: Int): Int = {
            if actual < 0 then segundo
            else {
                val tieneDigito: Boolean = (mask & (1 << actual)) != 0
                if tieneDigito then {
                    if mayor == -1 then encontrarSegundo(actual - 1, actual, segundo, mask)
                    else if segundo == -1 then actual
                    else segundo
                } else {
                    encontrarSegundo(actual - 1, mayor, segundo, mask)
                }
            }
        }
        val mask: Int = obtenerMascaras(n, 0)
        encontrarSegundo(9, -1, -1, mask)
    }

    def main(args: Array[String]): Unit = {
        println(segundoMayorDigito(58329))  
        println(segundoMayorDigito(7416))   
        println(segundoMayorDigito(9995))   
        println(segundoMayorDigito(777))    
        println(segundoMayorDigito(908090)) 
    }
}
