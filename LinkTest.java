package utils;

import java.util.Scanner;


public class LinkTest {
	public String url() {
		
		String url = null;
		System.out.println("Enter Option to check the link\n" + "1: TestLink = test.aadrikainfomedia\n"
				+"2: StaggingLink = aadrikainfomedia\n"+"3: UATLink = jharkhand e-governance");
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("You have selected TestLink");
		url = ("https://test.aadrikainfomedia.com/hrms/auth/login");
		break;
		case 2:
			System.out.println("You have selected Stagging Link");
			url = ("https://aadrikainfomedia.com/hrms/auth/login");
			break;
		case 3:
			System.out.println("You have selected UATLink");
			url = ("https://jharkhandegovernance.com/hrms/auth/login");
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}

		sc.close();
		
		return url;
	}

}
