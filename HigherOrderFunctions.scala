import scala.math._

object HigherOrderFunction {
	def main(args: Array[String]) {
		
		// underscore after log10 means we meant another function, not a variable
		val log10Func = log10 _
		
		def times3(num: Int) = num * 3
		def times4(num: Int) = num * 4

		// takes in a func that (takes an Int and returns a Double) and an Int
		def multIt(func: (Int) => Double, num: Int) = {
			func(num)
		}

		printf("4 * 100 = %.1f\n", multIt(times4, 100))

		// Closure : A function that depends upon a value created outside of that function
		val divisorVal = 5
		
		val divisor5 = (num: Double) => num / divisorVal

		println("5 / 5 = " + divisor5(5.0)) 
	}

	def mapAndFunc() {
		val log10Func = log10 _	
	
		println(log10Func(1000))

                List(1000.0, 10000.0).map(log10Func).foreach(println)

                List(1, 2, 3, 4, 5).map((x: Int) => x * 50).foreach(println)

                List(1, 2, 3, 4, 5).filter(_ % 2 == 0).foreach(println)
	
	}
} // End of HigherOrderFunction
