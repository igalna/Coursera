package week2


object Currying {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	def sum(f: Int => Int) : (Int, Int) => Int = {
		def sumF(a: Int, b: Int): Int =
			if (a > b) 0
			else f(a) + sumF(a + 1, b)
	sumF
	}                                         //> sum: (f: Int => Int)(Int, Int) => Int
	
	def sumInts = sum(x => x)                 //> sumInts: => (Int, Int) => Int
	def sumCubes = sum(x => x * x * x)        //> sumCubes: => (Int, Int) => Int
	def sumFactorials = sum(fact)             //> sumFactorials: => (Int, Int) => Int
	
	def fact(x: Int): Int =
  	if (x == 0) 1
  	else x * fact(x - 1)                      //> fact: (x: Int)Int
  
  sumInts(1, 5)                                   //> res0: Int = 15
  sumCubes(1, 5)                                  //> res1: Int = 225
  sumFactorials(1, 5)                             //> res2: Int = 153
  
  sumCubes(1, 10) + sumFactorials(10, 20)         //> res3: Int = 267634641

  def sumWithMultipleParameterLists(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 0
		else f(a) + sum(f)(a + 1, b)      //> sumWithMultipleParameterLists: (f: Int => Int)(a: Int, b: Int)Int

	sumWithMultipleParameterLists (fact) (1, 10)
                                                  //> res4: Int = 4037913
	sumWithMultipleParameterLists (x => x * x * x) (1, 10)
                                                  //> res5: Int = 3025
	sumWithMultipleParameterLists (x => x) (1, 10)
                                                  //> res6: Int = 55
}