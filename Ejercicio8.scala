import scala.annotation.tailrec

object ParcialSeccion2Ejercicio8 {

    def contarCambiosParidad(n: Int): Int = {
        if n < 10 then 0
        else {
            @tailrec
            def aux(num: Int, ultimoVisto: Int, acum: Int): Int = {
                if num == 0 then acum
                else {
                    val digitoActual: Int = num % 10
                    val cambio: Int = if (digitoActual % 2 != ultimoVisto % 2) then 1 else 0
                    
                    aux(num / 10, digitoActual, acum + cambio)
                }
            }
            val primerDigito: Int = n % 10
            aux(n / 10, primerDigito, 0)
        }
    }

    def main(args: Array[String]): Unit = {
        println(contarCambiosParidad(123456)) 
        println(contarCambiosParidad(24334)) 
        println(contarCambiosParidad(2468))   
        println(contarCambiosParidad(13579))  
        println(contarCambiosParidad(327))  
    }
}