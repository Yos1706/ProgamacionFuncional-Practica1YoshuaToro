object ParcialEjercicio5 {

    def extraerPares(n: Int): String = {
        if n == 0 then ""
        else {
            val resto: String = extraerPares(n / 10)
            val ultimo: Int = n % 10
            if ultimo % 2 == 0 then resto + ultimo.toString else resto
        }
    }

    def main(args: Array[String]): Unit = {
        println(extraerPares(583246)) 
        println(extraerPares(13579))  
        println(extraerPares(2468))   
        println(extraerPares(102034)) 
        println(extraerPares(908172)) 
        println(extraerPares(335612))
        println(extraerPares(430000))
    }
}