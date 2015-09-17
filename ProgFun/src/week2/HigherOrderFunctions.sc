package week2

object HigherOrderFunctions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def sum(f: Int => Int, a: Int, b: Int): Int =
  	if (a > b) 0
  	else f(a) + sum(f, a + 1, b)              //> sum: (f: Int => Int, a: Int, b: Int)Int
  
  def id(x: Int): Int = x                         //> id: (x: Int)Int
  
  def sumInts(a: Int, b: Int): Int =
  	sum(id, a, b)                             //> sumInts: (a: Int, b: Int)Int
  
  def sumCubes(a: Int, b: Int): Int =
  	sum(cube, a, b)                           //> sumCubes: (a: Int, b: Int)Int
  	
  def cube(x: Int): Int =
  	x * x * x                                 //> cube: (x: Int)Int
  
  def sumFactorials(a: Int, b: Int): Int =
  	sum(fact, a, b)                           //> sumFactorials: (a: Int, b: Int)Int
  
  def fact(x: Int): Int =
  	if (x == 0) 1
  	else fact(x -1)                           //> fact: (x: Int)Int
  
  
  sumInts(1, 5)                                   //> res0: Int = 15
  sumCubes(1,5)                                   //> res1: Int = 225
  sumFactorials(1,5)                              //> res2: Int = 5

}