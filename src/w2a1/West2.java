package w2a1;

public class West2 {
	public void west2() {
		System.out.println("Its not until you're right ontop of whatever the compas is pointing to that you find \n "
				+ "a note on the floor, damn and covered in mud you gently pick the fabrick based note up, "
				+ "\ngiving it a quick shake before you read it it states: A pass to Duskhold keep.");
		System.out.println("You look back at your compass, it says N:65, E:16 and S:◄(•_•)► W:10 ");
		//Its upsetting that the face doesn't display properly▲ ▲ ®
		//		 ¤ ┼  ┼ ¤								    ◄(• •)►
		//		 ╩─┼┬┬┼─╩								   •--|'|--•
		//		   ||||									      / \
		//		   ╩╩╩╩										 ◘   ◘
		String direction4 = App.scan.nextLine();
		switch (direction4) {
			case "west":
				System.out.println("You run as fast as you can, and reach a sign that says 'Duskhold keep',\n"
						+ "you fling that parchment you got earlier at a guard and run inside, safe, probably.");
			break;
			case "south":
				System.out.println("You find a bilboard with a troll face on it, game over.");
			break;
			case "north":
				System.out.println("You run north but get caught and die before you reach anything of interest.");
			break;
			case "east":
				System.out.println("You head east and run straight into the creature again, why you didn't look I'll never know.");
			break;
	}
}
}