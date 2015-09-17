package week2

object HigherOrderFunctions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def sumInts(a: Int, b: Int): Int =
  	if (a > b) 0 else a + sumInts(a + 1, b)   //> sumInts: (a: Int, b: Int)Int
  	
  def cube(x: Int): Int = x * x * x               //> cube: (x: Int)Int
  
  def sumCubes(a: Int, b: Int): Int =
  	if (a > b) 0 else cube(a) + sumCubes(a + 1, b)
                                                  //> sumCubes: (a: Int, b: Int)Int
  
  sumInts(1, 5)                                   //> res0: Int = 15
  cube(5)                                         //> res1: Int = 125
  sumCubes(1,5)                                   //> res2: Int = 225

}