import java.util.Scanner;
public class Calc04{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter Number 1 ");
		int num1 = scan.nextInt();
		System.out.print(" Enter opcode ");
		String opcode = scan.next();
		System.out.print("Enter Number 2 ");
		int num2 = scan.nextInt();
		int num3 = 0;
		String result = 0;
		switch(opcode){
			case "+" : num3 = num1 + num2;break;

			case "-" : num3 = num1 - num2;break;

			case "*" : num3 = num1 * num2;break;

			case "/" : num3 = num1 / num2;break;

			case "%" : num3 = num1 % num2;break;

			default : result = "NOT ANSWER";break;}

		if(!result.equals("NOT ANSWER")){
			result = num1 + opcode + num2 + "=" + num3;

		}
		System.out.print(result);
		
	}
}