import java.util.Scanner;
public class HowMuch{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("얼마에요?");
		int num1 = scanner.nextInt();
		System.out.println(num1 + "원입니다");
		System.out.println("몇개 드릴까요");
		int num2 = scanner.nextInt();
		System.out.println(num2 + "개 주세요");
		int num3 = num1 * num2;
		System.out.println("총 금액은" + num3 + "원 입니다");
		System.out.println("비싸요 깍아주세요");
		System.out.println("몇 퍼센트 DC 할께요?");
		int percent = scanner.nextInt();
		int result	= num3 - (num3*percent/100);
		
		if(  percent>=10 ){
			System.out.println("안팔아요");

		}else{ 
			System.out.println(result + "원입니다");

		}
	}
}