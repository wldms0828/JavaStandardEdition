import java.util.Scanner;
public class HowMuch{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�󸶿���?");
		int num1 = scanner.nextInt();
		System.out.println(num1 + "���Դϴ�");
		System.out.println("� �帱���");
		int num2 = scanner.nextInt();
		System.out.println(num2 + "�� �ּ���");
		int num3 = num1 * num2;
		System.out.println("�� �ݾ���" + num3 + "�� �Դϴ�");
		System.out.println("��ο� ����ּ���");
		System.out.println("�� �ۼ�Ʈ DC �Ҳ���?");
		int percent = scanner.nextInt();
		int result	= num3 - (num3*percent/100);
		
		if(  percent>=10 ){
			System.out.println("���Ⱦƿ�");

		}else{ 
			System.out.println(result + "���Դϴ�");

		}
	}
}