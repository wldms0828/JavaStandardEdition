import java.util.Scanner;
public class HowMuch{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�󸶿���?");
		int num1 = scanner.nextInt();
		System.out.println("100���Դϴ�");
		System.out.println("� �帱���");
		int num2 = scanner.nextInt();
		System.out.println("5�� �ּ���");
		int num3 = scanner.nextInt();
		System.out.println("�� �ݾ��� 500�� �Դϴ�");
		System.out.println("��ο� ����ּ���");
		int num4 = scanner.nextInt();
		System.out.println("�� �ۼ�Ʈ DC �Ҳ���?");
		
		
		
		if( 10 =< num4 ){
			System.out.println("475�� �Դϴ�.");

		}else{ 
			System.out.println("���Ⱦƿ�");

		}
	}
}