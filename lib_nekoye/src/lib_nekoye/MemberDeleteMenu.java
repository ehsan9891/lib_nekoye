package lib_nekoye;


import java.util.Scanner;

public class MemberDeleteMenu {

	public void showWelcome() {
		System.out.println("Welcome to Delete member menu");
	}

	public int getIdForDelete() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the INDEX of member : ");
		String id = scanner.next();

		return Integer.parseInt(id);
	}
}
