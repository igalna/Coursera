package week1

object tailRecursion {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	def gcd(a: Double, b: Double): Double = {
		if (b == 0) a else gcd(b, a % b)
	}                                         //> gcd: (a: Double, b: Double)Double
	
	def factorial (n: Int): Int =
		if (n == 0) 1 else n * factorial(n - 1)
                                                  //> factorial: (n: Int)Int
	
	def tailRecFactorial(n: Int): Int = {
		def loop(acc: Int, n: Int): Int =
			if (n == 0) acc
			else loop (acc * n, n -1)
		loop(1, n)
	}                                         //> tailRecFactorial: (n: Int)Int

	
	gcd(14,21)                                //> res0: Double = 7.0
	
	factorial(4)                              //> res1: Int = 24
	tailRecFactorial(4)                       //> res2: Int = 24

}