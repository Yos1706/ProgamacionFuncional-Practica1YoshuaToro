import scala.annotation.tailrec

object Ejercicio10 {

    def rachaMaxima(texto: String): Int = {
        if texto.isEmpty then 0
        else {
            @tailrec
            def aux(s: String, currentLen: Int, maxLen: Int, prevChar: Char): Int = {
                if s.isEmpty then math.max(currentLen, maxLen)
                else {
                    val headChar: Char = s.head
                    if headChar == prevChar then 
                        aux(s.tail, currentLen + 1, maxLen, prevChar)
                    else 
                        aux(s.tail, 1, math.max(currentLen, maxLen), headChar)
                }
            }
            aux(texto.tail, 1, 1, texto.head)
        }
    }

    def main(args: Array[String]): Unit = {
        println(rachaMaxima("aaabbccccdaa"))
        println(rachaMaxima("aabbbbbcc"))    
        println(rachaMaxima("abcde"))        
        println(rachaMaxima("aaaaaa"))      
        println(rachaMaxima("aabbbaaaa"))    
        println(rachaMaxima(""))             
        println(rachaMaxima("aaAAaa"))
        println(rachaMaxima("bbbbc"))    
        println(rachaMaxima("cccc"))   
    }
}