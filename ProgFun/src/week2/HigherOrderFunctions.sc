package week2

object HigherOrderFunctions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def sumInts(a: Int, b: Int): Int =
  	if (a > b) 0 else a + sumInts(a + 1, b)   //> sumInts: (a: Int, b: Int)Int
  	
  
  sumInts(1, 5)                                   //> res0: Int = 15

}