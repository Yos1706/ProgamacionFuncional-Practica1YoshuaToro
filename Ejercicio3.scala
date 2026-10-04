object Ejercicio3 {

    def contarDigitosPares(n: Int): Int = {
        if n == 0 then 1
        else {
            def aux(num: Int): Int = {
                if num == 0 then 0
                else {
                    val ultimo: Int = num % 10
                    val esPar: Int = if ultimo % 2 == 0 then 1 else 0
                    esPar + aux(num / 10)
                }
            }
            aux(n)
        }
    }

    def main(args: Array[String]): Unit = {
        println(contarDigitosPares(583246)) 
        println(contarDigitosPares(13579))  
        println(contarDigitosPares(2468))    
        println(contarDigitosPares(102030))  
        println(contarDigitosPares(7))      
    }
}