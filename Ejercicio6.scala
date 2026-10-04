import scala.annotation.tailrec

object Ejercicio6{

    def sumarDigitosPares(n: Int): Int = {
        @tailrec
        def aux(num: Int, acum: Int): Int = {
            if num == 0 then acum
            else {
                val ultimo: Int = num % 10
                val nuevoAcum: Int = if ultimo % 2 == 0 then acum + ultimo else acum
                aux(num / 10, nuevoAcum)
            }
        }
        aux(n, 0)
    }

    def main(args: Array[String]): Unit = {
        println(sumarDigitosPares(583246)) 
        println(sumarDigitosPares(13579))  
        println(sumarDigitosPares(2468))   
        println(sumarDigitosPares(102030)) 
        println(sumarDigitosPares(8))      
    }
}