object AbstractClassTutorial {
	def main(args: Array[String]) {
		val fang = new Wolf("Fang")
		fang.moveSpeed = 36.0
		println(fang.move)
	} // End of Main

	abstract class Mammal(val name: String) {
		var moveSpeed: Double
		
		def move: String
	}

	class Wolf(name: String) extends Mammal(name) {
		var moveSpeed = 35.0
		def move = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed)
	}	
} // End of AbstractClassTutorial
