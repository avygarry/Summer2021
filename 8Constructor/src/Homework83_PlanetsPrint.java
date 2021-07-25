
public class Homework83_PlanetsPrint {
public static void main(String[] args) {
	
	Homework83_Planets mercury = new Homework83_Planets();
	mercury.orbitalDistance = 58000000;
	mercury.distanceFromSun = 292900000;
	mercury.surfaceArea = 28880000;
	mercury.lengthOfDay = 1407;
	mercury.radius = 1516;
	mercury.hasRings = false;
	
	Homework83_Planets venus = new Homework83_Planets();
	venus.orbitalDistance = 108000000;
	venus.distanceFromSun = 67025000;
	venus.surfaceArea = 177700000;
	venus.lengthOfDay = 5832;
	venus.radius = 3760;
	venus.hasRings = false;
	
	Homework83_Planets earth = new Homework83_Planets();
	earth.orbitalDistance = 149600000;
	earth.distanceFromSun = 94452000;
	earth.surfaceArea = 196900000;
	earth.lengthOfDay = 24;
	earth.radius = 3958;
	earth.hasRings = false;
	
	Homework83_Planets mars = new Homework83_Planets();
	mars.orbitalDistance = 347472000;
	mars.distanceFromSun = 155750000;
	mars.surfaceArea = 55910000;
	mars.lengthOfDay = 25;
	mars.radius = 2106;
	mars.hasRings = false;
	
	Homework83_Planets jupiter = new Homework83_Planets();
	jupiter.orbitalDistance = 3037000000l;
	jupiter.distanceFromSun = 468120000;
	jupiter.surfaceArea = 23710000000l;
	jupiter.lengthOfDay = 10;
	jupiter.radius = 43441;
	jupiter.hasRings = true;
	
	Homework83_Planets saturn = new Homework83_Planets();
	saturn.orbitalDistance = 14270000000l;
	saturn.distanceFromSun = 923510000;
	saturn.surfaceArea = 1649000000l;
	saturn.lengthOfDay = 11;
	saturn.radius = 36184;
	saturn.hasRings = true;

	Homework83_Planets uranus = new Homework83_Planets();
	uranus.orbitalDistance = 2750000000l;
	uranus.distanceFromSun = 1835100000;
	uranus.surfaceArea = 3121000000l;
	uranus.lengthOfDay = 17;
	uranus.radius = 15759;
	uranus.hasRings = true;

	Homework83_Planets neptune = new Homework83_Planets();
	neptune.orbitalDistance = 4500000000l;
	neptune.distanceFromSun = 2780800000l;
	neptune.surfaceArea = 2941000000l;
	neptune.lengthOfDay = 16;
	neptune.radius = 15299;
	neptune.hasRings = true;

	System.out.println("------------------------------------------------------------");
	System.out.println(" Name    | Orbital Distance | Distance From Sun | Surface Area|  Length Of Day | Has Rings |");
	
	System.out.println(" Mercury | " + mercury.orbitalDistance + "         | " + mercury.distanceFromSun + " | " + mercury.surfaceArea + " | " + mercury.lengthOfDay + " | " + mercury.radius + " | " + mercury.hasRings);
	System.out.println(" Venus     | " + venus.orbitalDistance + "       | " + venus.distanceFromSun + " | " + venus.surfaceArea + " | " + venus.lengthOfDay + " | " + venus.radius + " | " + venus.hasRings);
	System.out.println(" Earth     | " + earth.orbitalDistance + "        | " + earth.distanceFromSun + " | " + earth.surfaceArea + " | " + earth.lengthOfDay + " | " + earth.radius + " | " + earth.hasRings);
	System.out.println(" Mars      | " + mars.orbitalDistance + "       | " + mars.distanceFromSun + " | " + mars.surfaceArea + " | " + mars.lengthOfDay + " | " + mars.radius + " | " + mars.hasRings);
	System.out.println(" Jupiter  | " + jupiter.orbitalDistance + "     | " + jupiter.distanceFromSun + " | " + jupiter.surfaceArea + " | " + jupiter.lengthOfDay + " | " + jupiter.radius + " | " + jupiter.hasRings);
	System.out.println(" Saturn   | " + saturn.orbitalDistance + "   | " + saturn.distanceFromSun + " | " + saturn.surfaceArea + " | " + saturn.lengthOfDay + " | " + saturn.radius + " | " + saturn.hasRings);
	System.out.println(" Uranus   | " + uranus.orbitalDistance + "    | " + uranus.distanceFromSun + " | " + uranus.surfaceArea + " | " + uranus.lengthOfDay + " | " + uranus.radius + " | " + uranus.hasRings);
	System.out.println(" Neptune | " + neptune.orbitalDistance + "     | " + neptune.distanceFromSun + " | " + neptune.surfaceArea + " | " + neptune.lengthOfDay + " | " + neptune.radius + " | " + neptune.hasRings);

	}

}
