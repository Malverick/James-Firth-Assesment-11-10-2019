package w2a1;

import java.util.Scanner;

public class App {
	public static Scanner scan = new Scanner(System.in);
	public static String chara;
	public static void main(String[] args) {
		System.out.println("\n Please enter all data in lowercase! \n");
		while (true) {
			CharacterAndSetting run = new CharacterAndSetting();
			chara = run.creation();
			run.setting();
			String d1 = App.scan.nextLine();
			switch (d1) {
				case "north":
					North1 nerth1 = new North1();
					nerth1.north1();
					break;
				case "east":
					East1 erst1 = new East1();
					erst1.east1();
					break;
				case "west":
					West1 werst1 = new West1();
					werst1.west1();
					break;
				case "south" :
					System.out.println("You start heading south untill you reach something of interest");
					South1 serth1 = new South1();
					serth1.south1();
					break;
			}
			System.out.println("Character " + chara +" signing off.");
			System.out.println("Would you like to play again?, yes to continue.");
			String uOp = scan.nextLine();
			if (uOp.equalsIgnoreCase("yes")) {
				System.out.println("Restarting");
			} else {
				System.out.println("Shutting Down");
				scan.close();
				break;
			}
			//Yep the character name was literally pointless. 
		}
	}
}
