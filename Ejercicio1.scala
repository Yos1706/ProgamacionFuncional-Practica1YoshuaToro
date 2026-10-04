object Ejercicio1 {

    def decimalABinario(n: Int): String = {
        if n == 0 then "0"
        else {
            def aux(num: Int): String = {
                if num == 0 then ""
                else aux(num / 2) + (num % 2)
            }
            aux(n)
        }
    }

    def main(args: Array[String]): Unit = {
        println(decimalABinario(1))  
        println(decimalABinario(2))  
        println(decimalABinario(5))  
        println(decimalABinario(10)) 
        println(decimalABinario(25)) 
        println(decimalABinario(42))
        println(decimalABinario(675)) 
    }
}