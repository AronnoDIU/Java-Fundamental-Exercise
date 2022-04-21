package JavaCollectionFramework.OnlineStore;

import JavaCollectionFramework.OnlineStore.Menu.Menu;
import JavaCollectionFramework.OnlineStore.Menu.Implements.MainMenu;

/**
 * 
 * @author Yeasir Arafat Aronno
 *
 */
public class Main {
	
	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		
		Menu mainMenu = new MainMenu();
		mainMenu.start();

	}

}