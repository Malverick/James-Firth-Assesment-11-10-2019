package w2a1;

public class West1 {
	public void west1() {
		System.out.println("You travel west for about 9 meters before you see something of interest emerging from \n"
				+ "the fog. A giant pair of glasses, the lenses where of course steamed up and as you approached \n"
				+ "you realized that they where in fact exact replica's of your own. On the nose bridge you \n"
				+ "find a note that reads: \nYou cannot escape, if you cannot see. The same ungodly noise \n"
				+ "you heard earlier repeats, seeming slightly closer than before now, the south side of the compas reads 20. "
				+ "\nYou find on the floor at the base of one of the giant lenses a regular pair of glasses. \n"
				+ "You put them on and shove your own in your pocket to find the fog appears to be gone when you look in \n"
				+ "the direction of the noise. ");
		System.out.println("To your south you see a large scaly creature slowly lumbering towards you, \n"
				+ "it appears to still see the fog. West and north now read 16 and 24 respectively.");
		System.out.println("\nChoose either north, west or south.");
		String direction2 = App.scan.nextLine();
		
		switch (direction2) {
			case "west":
				System.out.println("You continue westward perhaps hoping to find something else of use before the gap closes much further.");
				West2 west2 = new West2();
				west2.west2();
			break;
			case "north":
				System.out.println("You begin to make best speed northwards.");
				North2 north2 = new North2();
				north2.north2();
			break;
			case "south" :
				System.out.println("You run straight into the creature and get yourself killed, good job.");
			break;
			default:
		}
	}
}