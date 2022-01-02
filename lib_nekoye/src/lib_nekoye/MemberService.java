package lib_nekoye;

import java.util.List;

public class MemberService {

	public static void printMembers(List<Member> members) {
		
		int indx = 0;
		for (Member member : members) {
			System.out.println("--------------------------------");
			System.out.println(" Current Index is : " + indx);
			System.out.print(" ID : ");
			System.out.println(member.getId());

			System.out.print(" Name : ");
			System.out.println(member.getName());

			System.out.print(" Age : ");
			System.out.println(member.getAge());

			System.out.print(" Gender : ");
			System.out.println(member.getGender());

			System.out.println("--------------------------------");
			indx++;
		}

	}
}
