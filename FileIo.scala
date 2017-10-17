import java.io.PrintWriter
import scala.io.Source

object FileIo {
	def main(args: Array[String]) {
		
		val writer = new PrintWriter("test.txt")
		
		writer.write("Just some random text\nSome more random texts ")

		writer.close()

		val textFromFile = Source.fromFile("test.txt", "UTF-8")
		
		val lineIterator = textFromFile.getLines

		for(line <- lineIterator)
			println(line)
		
		textFromFile.close()
		
	} // End of Main
} // End of FileIo
