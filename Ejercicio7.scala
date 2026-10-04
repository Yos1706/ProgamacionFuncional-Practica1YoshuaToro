import scala.annotation.tailrec

object Ejercicio7{

    def contarMayusculas(texto: String): Int = {
        @tailrec
        def aux(s: String, acum: Int): Int = {
            if s.isEmpty then acum
            else {
                val incremento: Int = if s.head.isUpper then 1 else 0
                aux(s.tail, acum + incremento)
            }
        }
        aux(texto, 0)
    }

    def main(args: Array[String]): Unit = {
        println(contarMayusculas("HolaMundoScala"))  
        println(contarMayusculas("SCALA"))           
        println(contarMayusculas("programacion"))    
        println(contarMayusculas("Scala3EsGenial"))  
        println(contarMayusculas(""))
        println(contarMayusculas("HabitacionA"))
        println(contarMayusculas("GRACIAS"))                
    }
}