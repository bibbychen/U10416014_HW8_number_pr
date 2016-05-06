import java.math.BigDecimal;
import java.util.Scanner;
import javafx.application.Application;

//main method
public class TestNumber {
		public static void main(String []args){
			Number number = new Number();
		}
}

class Number {
	Number(){
		Scanner scanner = new Scanner(System.in);
		
		//let the user to enter the right number
		System.out.println("Input the first number.");
		String a = scanner.nextLine();
		
		//using BigDecimal to deal number
		BigDecimal number1 = new BigDecimal(a);
		System.out.println("Input the second number.");
		String b = scanner.nextLine();
		
		//using BigDecimal to deal number
		BigDecimal number2 = new BigDecimal(b);
		
		System.out.println("What do you want to do ? (1)plus (2)substract (3)multiply (4)divide");
		int select = scanner.nextInt();
		
		//use switch to select the four functions
		switch(select){
		case 1:
			System.out.println(number1.add(number2));
			break;
		case 2:
			System.out.println(number1.subtract(number2));
			break;
		case 3:
			System.out.println(number1.multiply(number2));
			break;
		case 4:
			System.out.println(number1.divide(number2,100,BigDecimal.ROUND_HALF_UP));
			break;
		default:
			System.out.println("ERROR");
			break;

		}
	}
}