object TraitsTutorial {
	def main(args: Array[String]) {
		val superman = new Superhero("Superman")
		println(superman.fly)	
		println(superman.hitByBullet)
		println(superman.ricochet(2500))
		
		
	} // End of main

	trait Flyable {
		def fly: String
	}

	trait BulletProof {
		def hitByBullet: String
		
		// concrete
		def ricochet(startSpeed: Double) : String = {
			"The bullet, ricochets at a speed of %.1f ft/sec".format(startSpeed * .75)	
		}
	}

	class Superhero(val name: String) extends Flyable with BulletProof {
		def fly = "%s flys through the air".format(this.name)
		
		def hitByBullet = "The bullet bounches off of %s".format(this.name)
	}

	
} // End of TraitsTutorial
