import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
	def main(args: Array[String]) {
		tupleStuff
	}

	def tupleStuff() {
		// tuples are normally immutable
		var tupleMarge = (103, "Marge Simpson", 10.25)
		
		printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)
		
		tupleMarge.productIterator.foreach{ i => println(i)}

		println(tupleMarge.toString())
	}

	def mapStuff() {
		val employees = Map("Manager" -> "Bob Smith", 
			"Secretary" -> "Sue Brown")

		if (employees.contains("Manager"))
			printf("Manager : %s\n", employees("Manager"))

		// Changable Map
		val customers = collection.mutable.Map(100 -> "Paul Smith", 
			101 -> "Sally Smith")
		printf("Cust 1 : %s\n", customers(100))
		
		customers(100) = "Tom Marks"
		customers(102) = "Megan Swift"

		for ((k, v) <- customers)
			printf("%d: %s\n", k, v)
	}

	def arrayStuff() {
		val favNums = new Array[Int](20)
		val friends = Array("Bob", "Tom")
		
		friends(0) = "Sue"

		println("Best friends " + friends(0))

		
		// ArrayBuffer
		val friends2 = ArrayBuffer[String]()
		
		friends2.insert(0, "Phil")

		friends2 += "Mark"
	
		friends2 ++= Array("Susy", "Paul") // Multiple values 

		friends2.insert(1, "Mike", "Sally", "Sam", "Mary", "Sue")

		friends2.remove(1, 2)

		var friend : String = " "

		for (friend <- friends2)
			println(friend)

		for (j <- 0 to (favNums.length - 1)) {
			favNums(j) = j
		}

		val favNumsTimes2 = for (num <- favNums) yield 2 * num

		favNumsTimes2.foreach(println)

		var favNumsDiv4 = for (num <- favNums if num % 4 == 0) yield num
		
		favNumsDiv4.foreach(println)

		// Multi Dimensional Array
		var multTable = Array.ofDim[Int](10, 10)
		
		for (i <- 0 to 9) {
			for (j <- 0 to 9){
				multTable(i)(j) = i * j
			}
		}

		for (i <- 0 to 9) {
			for (j <- 0 to 9) {
				printf("%d : %d = %d\n", i, j, multTable(i)(j))
			}
		}

		println("Sum: " + favNums.sum)
		println("Min: " + favNums.min)
		println("Max: " + favNums.max)

		val sortedNums = favNums.sortWith(_>_)

		println(sortedNums.deep.mkString(", "))
	}	
	
		

	def factorial(num: BigInt) : BigInt = {
		if(num <= 1)
			1
		else
			num * factorial(num - 1)
	}

	def getSum(args : Int*) : Int = {
		var sum : Int = 0
		for (num <- args) {
			sum += num
		}
		sum
	}

	def sayHi() : Unit = {
		// Procedure
		println("Hi how are you")
	}
	
	def getSum(num1: Int = 1, num2: Int = 1) : Int = {
		// return keyword is optional
		num1 + num2
	}	

	def strings() {
		var randSent = "I saw a dragon fly by"
		val randSentArray = randSent.toArray

		for (v <- randSentArray)
			println(v)
	}

	def printingStuff() {
		val name = "Derek"
		val age = 39
		val weight = 175.3

		println(s"Hello $name")
		println(f"I am ${age + 1} and weigh $weight%.2f") 

		printf("'%5d'\n", 5) // justify
		printf("'%-5d'\n", 5) // left justify

		printf("'%-5s'\n", "hi")

		printf("'%05d'\n", 5) // zero fill


	}

	def printPrimes() {
			val primeList = List(1, 2, 3, 5, 7, 11)
			for (i <- primeList) {
				if (i == 11) {
					return
				}
				
				if (i != 1) {
					println(i)
				}
			}	
	}

	def guessNumber() {
			var numberGuess = 0
			
			do {
				println("Guess a number")
				numberGuess = readLine.toInt
			} while(numberGuess != 15)

			printf("You guessed the secret number %d\n", 15)
	}

	def loopsAndAll() {
		var i = 0
		
		while(i <= 10) {
			print(i)
			i += 1
		}
	
		println()

		for (i <- 1 to 10)
			print(i)
		
		val randLetters = "ABCDEFGHIJKLMNOPQURSTUVWXYZ"
		
		println()

		for (i <- 0 until randLetters.length)
			print(randLetters(i))

		println()

		val aList = List(1, 2, 3, 4, 5)
		for (i <- aList)
			print("\t List item " + i)

		println()

		var evenList = for{ i <- 1 to 20
			if (i % 2) == 0
		} yield i

		for (i <- evenList)
			print(i)
	
		println()

		for ( i <- 1 to 5; j <- 6 to 10) {
			print("i :" + i)
			print("j :" + j)
		}
	}

}
