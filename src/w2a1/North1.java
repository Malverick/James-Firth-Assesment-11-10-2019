package w2a1;

public class North1 {
	public void north1() {
		System.out.println("You head north, away from whatever was lurking to the south and find, after a short walk, a cave. \n"
				+ "entering the cave you come to a fork in the path, the cave is dark however a small trickly of \n"
				+ "glowing liquid provides just enough light to make out the shape of the cave. To the right the cave \n"
				+ "appears to continue down a long winding path, and in the distance on the left a dim warm light flickers \n"
				+ "from around the corner. \nChoose either left or right.");
		System.out.println("The compass will probably be useless underground.");
		String direction2 = App.scan.nextLine();
		
		switch (direction2) {
			case "left":
				System.out.println("Heading to the left you come across a tall thin man dressed in a suit, \n"
					+ "he sits next to a slowly fading fire with his top hat resting on a rock. his cane \n"
					+ "propped against the wall he turns to look at you and asks 'Spot of tea?'. \n"
					+ "Unable to resist his offer in such a harsh land you sit with him for a while. "
					+ "\nhis experiance of the land appears very similar to yours though he's been here longer.");
			break;
			case "right":
				System.out.println("You follow the cave system around to the right, the glowing blue stream \n"
					+ "heading down the winding path with you providing your only source of light. \n"
					+ "Before you the stream appears to drop into a large cavern as you stand atop where \n"
					+ "you think the edge to be you are faced with the choice of going back, or taking a leap.");
				System.out.println("Do you head back and give up, or taket he leap? (leap or back)");
				String direction3 = App.scan.nextLine();
				switch (direction3){
					case "leap":
						System.out.println("You take what many would call 'A leap of fath' and others perhaps stupid. \n"
								+ "Either way you fall for but a moment before landing on a new ledge, sets of lights \n"
								+ "turning on before you and up ahead for find a treasure chest with what looks like a portal \n"
								+ "next to it, you load your pockets with treasure and head through the portal. \n"
								+ "shortly after finding yourself in downtown New York. Congratulations you win.");
						break;
					default:
						System.out.println("You turn back");
			}
		}
	}
}
