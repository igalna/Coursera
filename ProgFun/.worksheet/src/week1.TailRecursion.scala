package week1

object tailRecursion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  println("Welcome to the Scala worksheet");$skip(82); 

	def gcd(a: Double, b: Double): Double = {
		if (b == 0) a else gcd(b, a % b)
	};System.out.println("""gcd: (a: Double, b: Double)Double""");$skip(75); 
	
	def factorial (n: Int): Int =
		if (n == 0) 1 else n * factorial(n - 1);System.out.println("""factorial: (n: Int)Int""");$skip(141); 
	
	def tailRecFactorial(n: Int): Int = {
		def loop(acc: Int, n: Int): Int =
			if (n == 0) acc
			else loop (acc * n, n -1)
		loop(1, n)
	};System.out.println("""tailRecFactorial: (n: Int)Int""");$skip(15); val res$0 = 

	
	gcd(14,21);System.out.println("""res0: Double = """ + $show(res$0));$skip(16); val res$1 = 
	
	factorial(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(21); val res$2 = 
	tailRecFactorial(4);System.out.println("""res2: Int = """ + $show(res$2))}

}
