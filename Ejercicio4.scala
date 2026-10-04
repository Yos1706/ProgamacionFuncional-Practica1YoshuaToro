object Ejercicio4 {

    def contarDigito(n: Int, digito: Int): Int = {
        if n == 0 then {
            if digito == 0 then 1 else 0
        } else {
            def aux(num: Int): Int = {
                if num == 0 then 0
                else {
                    val ultimo: Int = num % 10
                    val coincide: Int = if ultimo == digito then 1 else 0
                    coincide + aux(num / 10)
                }
            }
            aux(n)
        }
    }

    def main(args: Array[String]): Unit = {
        println(contarDigito(525235, 5)) 
        println(contarDigito(11111, 1))  
        println(contarDigito(987654, 3)) 
        println(contarDigito(707070, 0)) 
    }
}