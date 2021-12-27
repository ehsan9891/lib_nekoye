package lib_nekoye;

import java.io.IOException;
import java.lang.reflect.Array;

public class Main {

	private Array members;
	
	public static void main(String[] args) {
		
		System.out.println("Hello to my application!");
		System.out.println("Please select an item from menu:");
		System.out.println("1 - Create Members");
		System.out.println("2 - List Members");
		
		try {
			char menu_item;
			
			menu_item = (char)System.in.read();
		
		switch (menu_item) {
		case '1': {

			System.out.println("Welcome to Create member menu");
			break;
		}
		case '2':
			System.out.println("Welcome to List member menu");
			break;
			
		default:
			System.out.println("Unexpected value: " + menu_item);
		}
		}catch(IOException exception) {
			System.out.println("Error reading from user");
			
		}

	}

}
