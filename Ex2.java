
import java.lang.Math.*;
public class Ex2 {

	private double num1=549.243d;
	private double num2=1234d;
	 public void ceilVal()
	 {
		 System.out.println("Ceiling value of number 1 :"+Math.ceil(num1));
		 System.out.println("Ceiling value of number 2 :"+Math.ceil(num2));
	 }
	 
	 public void maxVal()
	 {
		 System.out.println("maximum value is :"+Math.max(num1, num2));
	 }
	 
	 public void sqrtVal()
	 {
		 System.out.println("square root value of number 1 :"+Math.sqrt(num1));
		 System.out.println("square root value of number 2 :"+Math.sqrt(num2));
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2 e2;
		e2=new Ex2();
		e2.ceilVal();
		e2.maxVal();
		e2.sqrtVal();
	}

}