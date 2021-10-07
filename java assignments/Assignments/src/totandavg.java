import java.util.Scanner;

public class totandavg {
	
	public static void main(String[] args) {
	int a,b,c,a1,b1,c1,a2,b2,c2,a3,b3,c3,x1,y1,x2,y2,x3,y3,z1,z2,z3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Student1's SubjectA marks: ");
	a1 = sc.nextInt();
	System.out.println("Enter the Student1's SubjectB marks: ");
	b1 = sc.nextInt();
	System.out.println("Enter the Student1's SubjectC marks: ");
	b1 = sc.nextInt();
	System.out.println("Enter the Student2's SubjectA marks: ");
	a2 = sc.nextInt();
	System.out.println("Enter the Student2's SubjectB marks: ");
	b2 = sc.nextInt();
	System.out.println("Enter the Student2's SubjectC marks: ");
	b2 = sc.nextInt();
	System.out.println("Enter the Student3's SubjectA marks: ");
	a3 = sc.nextInt();
	System.out.println("Enter the Student3's SubjectB marks: ");
	b3 = sc.nextInt();
	System.out.println("Enter the Student3's SubjectC marks: ");
	b3 = sc.nextInt();
	x1= a1+b1+b1;
	y1= x1/3;
	x2 = a2+b2+b2;
	y2 = x2/3;
	x3 = a3+b3+b3;
	y3 = x3/3;
	a = a1+a2+a3;
	b = b1+b2+b3;
	c = b1+b2+b3;
	z1=a/3;
	z2=b/3;
	z3=c/3;
	System.out.println("Student1: Total Marks ="+x1+ " and Average Marks ="+y1);
	System.out.println("Student2: Total Marks ="+x2+ " and Average Marks ="+y2);
	System.out.println("Student3: Total Marks ="+x3+ " and Average Marks ="+y3);
	System.out.println("Total Marks in SubjectA = " +a+ " ,SubjectB = "+b+" ,SubjectC = "+c);
	System.out.println("Average Marks in SubjectA = " +z1+ " ,SubjectB = "+z2+" ,SubjectC = "+z3);		
	}
}