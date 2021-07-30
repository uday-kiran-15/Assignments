package uday;


import java.util.Scanner;
public class main {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int b=sc.nextInt();
		sc.nextLine();
		String x=sc.nextLine();
		char c= x.charAt(0);
		String a1=sc.nextLine();
		int b1=sc.nextInt();
		sc.nextLine();
		String x1=sc.nextLine();
		char c1= x1.charAt(0);
		Person p1=new Person(a,b,c);
		Person p2=new Person(a1,b1,c1);
		if(p1.equals(p2)) {
			System.out.println("two perwsons are same");
		}
		else
				System.out.println("two are diff");

		
	}

}
