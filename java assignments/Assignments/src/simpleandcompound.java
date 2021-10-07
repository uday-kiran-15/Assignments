import java.util .*;

public class simpleandcompound {

	public static void main(String[] args) {
		float i = 0, pr, t , r , com;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principle amount");
		pr = sc.nextFloat();
		System.out.println("enter time period");
		t = sc.nextFloat();
		System.out.println("enter rate ");
		r= sc.nextFloat();
		i=(pr*t*r)/100;
		com=(float) (pr * Math.pow(1.0+r/100.0,t) - pr);
		System.out.println("simple intrest is "+i);
		System.out.println("compount intrest is "+ com);
		
		
	}

}
