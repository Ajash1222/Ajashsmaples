package ajash;

import java.util.Scanner;

public class employee {

	public static void main(String[] args) {
		double sal,da=0.12,hra=0.13,pf=0.15,grass;
		System.out.println("enter salary");
		Scanner sc=new Scanner(System.in);
		sal=sc.nextInt();
		da=sal*0.12;
		hra=sal*0.13;
		pf=sal*0.15;
		System.out.println("the dialy allowance is" +da);
		System.out.println("the house rent is" +hra);
		System.out.println("the pf is" +pf);
		grass=sal+da+hra+pf;
		System.out.println("the total grass is" +grass);
	
				
		
		

	}

}
