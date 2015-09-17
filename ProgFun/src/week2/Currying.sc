package week2


object Currying {
  println("Welcome to the Scala worksheet")

	def sum(f: Int => Int) : (Int, Int) => Int = {
		def sumF(a: Int, b: Int): Int =
			if (a > b) 0
			else f(a) + sumF(a + 1, b)
	sumF
	}
	
	def sumInts = sum(x => x)
	def sumCubes = sum(x => x * x * x)
	def sumFactorials = sum(fact)
	
	def fact(x: Int): Int =
  	if (x == 0) 1
  	else x * fact(x - 1)
  
  sumInts(1, 5)
  sumCubes(1, 5)
  sumFactorials(1, 5)
  
  sumCubes(1, 10) + sumFactorials(10, 20)

  def sumWithMultipleParameterLists(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 0
		else f(a) + sum(f)(a + 1, b)

	sumWithMultipleParameterLists (fact) (1, 10)
	sumWithMultipleParameterLists (x => x * x * x) (1, 10)
	sumWithMultipleParameterLists (x => x) (1, 10)
     
     
     
     

	
	
	def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
		if (a > b) zero
		else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
		
		
	def product(f: Int => Int) (a: Int, b: Int): Int =
  	mapReduce(f, (x, y) => x * y, 1)(a, b)
  
  def factInTermsOfProduct(n: Int) = product(x => x)(1, n)
  
  product(x => x * x)(1, 5)
	factInTermsOfProduct(5)

}