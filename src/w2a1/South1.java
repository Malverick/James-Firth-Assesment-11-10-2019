package w2a1;

public class South1 {
	public void south1() {
		System.out.println("After walking for about 12 meters a object begins to loom out of the fog. \n"
				+ "you get closer to it still following the compass like device in your hand before realizing"
				+ " \nits pointing at the large scally figure you now find yourself infront of."
				+ " \nit looks at you and a chill runs down your spine. ");
		System.out.println("\nYou don't have time to read the compass, chose a direction. (east, west or forther south)");
		String direction2 = App.scan.nextLine();
		
		switch (direction2) {
			case "east":
				System.out.println("You feel a large claw dig into your right before passing out");
				System.out.println("You appear to have died.");
			break;
			case "west":
				System.out.println("You feel a large claw dig into your left before passing out");
				System.out.println("You appear to have died.");
			break;
			case "south" :
				System.out.println("You charge straight at the creature and try run between its legs. \n"
					+ "The last thing you remember seeing is your own organs being \n"
					+ "violenty thrown into the air infront of you.");
				System.out.println("You appear to have died.");
			break;
			default:
	}
}
}
