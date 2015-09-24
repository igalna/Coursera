package week2

import math.abs

class Rational(x: Int, y: Int) {
	require(y != 0, "Denominator must be non-zero")

	def this(x: Int) = this(x, 1)

	private def gcd(a: Int, b: Int): Int =
		if (b == 0) a
		else gcd(b, a % b)
	private val g = gcd(x,y)
	def numer = x / g
	def denom = y / g
	
	def + (that: Rational) =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
	
	def - (that: Rational) = -that
	
	def unary_- : Rational = new Rational(-numer, denom)
		
	def < (that: Rational) =
		this.numer * that.denom < that.numer * this.denom
	
	def max(that: Rational) =
		if (this < (that)) that
		else this
		
	override def toString =
		numer + " / " + denom
}

object Rationals {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val x = new Rational(1, 3)                      //> x  : week2.Rational = 1 / 3
  val y = new Rational(5, 7)                      //> y  : week2.Rational = 5 / 7
  val z = new Rational(3, 2)                      //> z  : week2.Rational = 3 / 2
  
  x - y - z                                       //> res0: week2.Rational = 3 / -2
  y + y                                           //> res1: week2.Rational = 10 / 7
  
  x < y                                           //> res2: Boolean = true
  
  x max y                                         //> res3: week2.Rational = 5 / 7
  
  new Rational(2)                                 //> res4: week2.Rational = 2 / 1
  
  new Rational(1, 2).numer                        //> res5: Int = 1
  
  new Rational(1, 2) < (new Rational(2, 3))       //> res6: Boolean = true
}