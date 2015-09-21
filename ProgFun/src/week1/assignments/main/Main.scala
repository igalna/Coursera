package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = 
    if (c == 0) 1
    else if (r == c) 1
    else pascal(c -1, r - 1) + pascal(c, r -1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def loop (chars: List[Char], count: Int): Boolean = {
      (chars, count) match {
        case (chars, 0) if chars.isEmpty => true
        case (chars, _) if chars.isEmpty => false
        case (chars, c) => 
          chars.head match {
            case '(' => loop(chars.tail, count + 1)
            case ')' if (count > 0) => loop (chars.tail, count - 1)
            case ')' => false
            case _ => loop(chars.tail, count)
          }
      }
    }
    loop(chars, 0)
  }
  
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
