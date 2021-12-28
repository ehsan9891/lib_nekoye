package lib_nekoye;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	List<Member> members = new ArrayList<Member>();
	int memberId = 10000;

	public static void main(String[] args) {

		System.out.println("Hello to my application!");
		Main main = new Main();
		main.showMainMenu();


	}
	private void showMainMenu() {
		System.out.println("Please select an item from menu:");
		System.out.println("1 - Create Members");
		System.out.println("2 - List Members");

		try {
			char menu_item;

			menu_item = (char)System.in.read();

			switch (menu_item) {
			case '1': {

				MemberCreateMenu memberCreateMenu = new MemberCreateMenu();
				Member createdMember;
				
				// show welcome
				memberCreateMenu.showWelcome();
				
				// Get input and create object
				createdMember = memberCreateMenu.getInput(this.memberId);
				
				// Add it to list
				this.members.add(createdMember);
				
				// Report
				System.out.println("New user created with id " + createdMember.getId());
				System.out.println("Total users count : " + this.members.size());

				//Increase user ID
				this.memberId++;

				this.showMainMenu();
				break;
			}
			case '2':
				MemberListMenu memberListMenu = new MemberListMenu();
				memberListMenu.showWelcome();
				break;

			default:
				System.out.println("Unexpected value: " + menu_item);
			}
		}catch(IOException exception) {
			System.out.println("Error reading from user");

		}
	}

}
