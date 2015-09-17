package week2

object HigherOrderFunctions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
  	def loop(a: Int, acc: Int): Int = {
  		if (a > b) acc
  		else loop(a + 1, f(a) + acc)
  	}
  	loop(a, 0)
  }                                               //> sum: (f: Int => Int)(a: Int, b: Int)Int
  def id(x: Int): Int = x                         //> id: (x: Int)Int
  
  def sumInts(a: Int, b: Int): Int =
  	sum(x => x)(a, b)                         //> sumInts: (a: Int, b: Int)Int
  
  def sumCubes(a: Int, b: Int): Int =
  	sum(x => x * x * x)(a, b)                 //> sumCubes: (a: Int, b: Int)Int
  	
  def cube(x: Int): Int =
  	x * x * x                                 //> cube: (x: Int)Int
  
  def sumFactorials(a: Int, b: Int): Int =
  	sum(fact)(a, b)                           //> sumFactorials: (a: Int, b: Int)Int
  
  def fact(x: Int): Int =
  	if (x == 0) 1
  	else x * fact(x -1)                       //> fact: (x: Int)Int
  
  
  sumInts(1, 5)                                   //> res0: Int = 15
  sumCubes(1,5)                                   //> res1: Int = 225
  sumFactorials(1,5)                              //> res2: Int = 153

}