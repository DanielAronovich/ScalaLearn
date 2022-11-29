package mycode

/**
  * This simple application is an invitation to you to play around with any Scala code you like!
  * (not that you'd not be able to create your own application, mind you.)
  *
  * So get creative - test the code that we write in the videos and try new things!
  *
  * Daniel @ Rock the JVM
  */
object Playground extends App {
  // calculate abs function
  def abs(x: Double) = if (x >= 0) x else -x

  println(abs(-5))

  // calculate square root function

  def sqrt(x: Double): Double = {

    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def improve(guess: Double, x: Double): Double =
      (guess + x / guess) / 2

    def isGoodEnough(guess: Double, x: Double): Boolean =
      abs(guess * guess - x) < 0.001

    sqrtIter(1.0, x)
  }

  println(sqrt(0.1e-20))

}
