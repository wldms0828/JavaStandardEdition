import java.util.Scanner;
public class HowMuch{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("얼마에요?");
		int num1 = scanner.nextInt();
		System.out.println("100원입니다");
		System.out.println("몇개 드릴까요");
		int num2 = scanner.nextInt();
		System.out.println("5개 주세요");
		int num3 = scanner.nextInt();
		System.out.println("총 금액은 500원 입니다");
		System.out.println("비싸요 깍아주세요");
		int num4 = scanner.nextInt();
		System.out.println("몇 퍼센트 DC 할께요?");
		
		
		
		if( 10 =< num4 ){
			System.out.println("475원 입니다.");

		}else{ 
			System.out.println("안팔아요");

		}
	}
}