package mycode

/**
  * This simple application is an invitation to you to play around with any Scala code you like!
  * (not that you'd not be able to create your own application, mind you.)
  *
  * So get creative - test the code that we write in the videos and try new things!
  *
  * Daniel @ Rock the JVM
  */
object loops extends App {


  val r1 = (1 to 10).reverse.mkString(", ")
  val r2 = (10 to 1 by -1).mkString(", ")
  println(r1)
  println(r2)


  var r3 = ""
  for (a <- 1 to 10) {
    r3 += a
    if (a < 10) r3 += ", "
  }
  println(r3)


  val xs = List(1, 2, 3, 4, 5)
  var list = List[Int]()

  for (a <- xs) {
    list = list :+ (a + 1)
  }
  println(list)

  val r4 = for (a <- xs) yield a + 1
  println(r4)

  var a = 5
  val b = 10
  while (a < b) {
    println(a * b)
    a += 1
  }

  a = 5
  do {
    println(a * b)
    a += 1
  } while (a < b)
}
