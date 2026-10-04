object ParcialEjercicio2 {

    def digitoMayor(n: Int): Int = {
        if n < 10 then n
        else {
            val ultimoDigito: Int = n % 10
            val mayorResto: Int = digitoMayor(n / 10)
            if ultimoDigito > mayorResto then ultimoDigito else mayorResto
        }
    }

    def main(args: Array[String]): Unit = {
        println(digitoMayor(58329))  
        println(digitoMayor(4441))   
        println(digitoMayor(123456)) 
        println(digitoMayor(80723))  
        println(digitoMayor(5))
        println(digitoMayor(590))
        println(digitoMayor(22))      
    }
}