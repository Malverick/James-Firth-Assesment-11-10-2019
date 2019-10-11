package w2a1;

public class East1 {
	public void east1() {
		System.out.println("After heading east for only a moment you come across a large dark fortress \n"
				+ "entering you see little more than a large kitchen, a half rat half man frantically \n"
				+ "running around moving cheese from one play to the next, taking the occasional nibble. \n"
				+ "\nYou can choose to fight the odd rat man, or simply turn and leave. ");
		String direction2 = App.scan.nextLine();
		
		switch (direction2) {
			case "fight":
				System.out.println("You grab a particularly pointy bit of cheese and throw it at him before he realizes \n"
					+ "you're even there, he looks at you startled as he finds himself pinned to the wall by old cheeses \n"
					+ "that he should have sorted out ages ago.");
				System.out.println("Moral of the story, always clean your living space.");
			break;
			case "fite":
				System.out.println("I see you too are a man of culture, however I'm too lazy to make an option for that.");
			break;
			case "leave":
				System.out.println("So you waddle away, till the very next day.");
			break;
	}
}
}