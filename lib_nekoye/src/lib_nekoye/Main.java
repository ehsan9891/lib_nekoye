package lib_nekoye;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		System.out.println("3 - Edit Members");
		System.out.println("4 - Delete Members");

		Scanner scanner = new Scanner(System.in);
		int menu_item = scanner.nextInt();

		switch (menu_item) {

		case 1: 

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

		case 2:

			MemberService.printMembers(this.members);

			this.showMainMenu();

			break;

		case 3:
			MemberEditMenu memberEditMenu = new MemberEditMenu();
			memberEditMenu.showWelcome();
			MemberService.printMembers(this.members);
			int idForUpdate = memberEditMenu.getIdForEdit();
			Member updatedMember = memberEditMenu.getValues(idForUpdate);
			this.members.set(idForUpdate, updatedMember);
			System.out.println("Member has been updated");

			this.showMainMenu();
			break;

		case 4:
			MemberDeleteMenu memberDeleteMenu = new MemberDeleteMenu();
			memberDeleteMenu.showWelcome();
			MemberService.printMembers(this.members);
			int idForDelete =memberDeleteMenu.getIdForDelete();
			this.members.remove(idForDelete);
			System.out.println("Member has been deleted");
			this.showMainMenu();
			break;

		default:
			System.out.println("Unexpected value: " + menu_item);
			break;
		}
	}

}
