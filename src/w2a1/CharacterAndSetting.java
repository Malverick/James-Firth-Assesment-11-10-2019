package w2a1;

public class CharacterAndSetting {

	public String creation() {
		System.out.println("Select a player name");
		String playerId = App.scan.nextLine();
		System.out.println("You have chosen to name your character " + playerId);
		return playerId;
	}


	public void setting() {
		System.out.println("You finds yourself in a seemingly infinite swamp, an endless sea of dark  clouds \n"
				+ "loom mere feet above your head and you find yourself woefully unprepared for the journey back to civilization.");
		System.out.println(
				"You find in your pocket an odd looking compass with numbers, seemingly distances, etched into \n"
						+ "north east south and west. You walk north for a few meters and find the numbers change accordingly.");
		System.out.println("The numbers read; N: 13, E: 11, S: 22, W: 19. You squint, attempting to obtain any visual \n"
				+ "of what may lie ahead though you find the fog prevents any such visual indicators from more than about 10m out. \n"
				+ "To the south you hear a loud shreik and possibly some movement, you shouldn't linger here long.");
		System.out.println("Choose a direction to travel.");
	}
	
}
