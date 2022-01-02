package lib_nekoye;


import java.util.Scanner;

public class MemberEditMenu {

	public void showWelcome() {
		System.out.println("Welcome to Edit member menu");
	}

	public int getIdForEdit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the INDEX of member : ");
		String id = scanner.next();

		return Integer.parseInt(id);
	}

	public Member getValues(int memberId) {
		// name
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the name : ");
		String name = scanner.next(); 
		System.out.println("Your name: " + name);

		// age
		System.out.println("Please enter the age : ");
		String age = scanner.next();
		System.out.println("Your age: " + age);
		int numerical_age = Integer.parseInt(age);

		// name
		System.out.println("Please enter the gender : ");
		String gender = scanner.next();
		System.out.println("Your gender: " + gender);

		Member member = new Member(memberId, name, numerical_age, gender);

		return member;
	}
}
