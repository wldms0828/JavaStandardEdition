import java.util.Scanner;
public class Hola{
	public static void main(String[] args){
		System.out.print("이름 - ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.print("올라"+name);
	}
}
