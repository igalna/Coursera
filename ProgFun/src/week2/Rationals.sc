package week2

import math.abs

class Rational(x: Int, y: Int) {
	require(y != 0, "Denominator must be non-zero")

	def this(x: Int) = this(x, 1)

	private def gcd(a: Int, b: Int): Int =
		if (b == 0) a
		else gcd(b, a % b)
		
	def numer = x
	def denom = y
	
	def add(that: Rational) =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
	
	def sub(that: Rational) = add(that.neg)
	
	def neg: Rational = new Rational(-numer, denom)
		
	def less(that: Rational) =
		this.numer * that.denom < that.numer * this.denom
	
	def max(that: Rational) =
		if (this.less(that)) that
		else this
		
	override def toString = {
		val g = gcd(x,y)
		numer / g + " / " + denom / g
	}
}

object Rationals {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val x = new Rational(1, 3)                      //> x  : week2.Rational = 1 / 3
  val y = new Rational(5, 7)                      //> y  : week2.Rational = 5 / 7
  val z = new Rational(3, 2)                      //> z  : week2.Rational = 3 / 2
  
  x.sub(y).sub(z)                                 //> res0: week2.Rational = -79 / 42
  y.add(y)                                        //> res1: week2.Rational = 10 / 7
  
  x.less(y)                                       //> res2: Boolean = true
  
  x.max(y)                                        //> res3: week2.Rational = 5 / 7
  
  new Rational(2)                                 //> res4: week2.Rational = 2 / 1
  
}