import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter R.S.P");
		String alp1 = scan.next();
		System.out.println("Enter R.S.P");
		String alp2 = scan.next();
	

		if(alp1.equals("R") && alp2.equals("R")){
			
			System.out.println("���");

		}else if(alp1.equals("R") && alp2.equals("S")){
		
			System.out.println("alp1 �̱�");
		
		}else if(alp1.equals("R") && alp2.equals("P")){
		
			System.out.println("alp2 �̱�");

		}else if(alp1.equals("S") && alp2.equals("R")){
			
			System.out.println("alp2�¸�");

		}else if(alp1.equals("S") && alp2.equals("S")){
		
			System.out.println("���");

		}else if(alp1.equals("S") && alp2.equals("P")){
			
			System.out.println("alp1 �̱�");

		}else if(alp1.equals("P") && alp2.equals("S")){
			
			System.out.println("alp2 �̱�");

		}else if(alp1.equals("P") && alp2.equals("P")){
			
			System.out.println("���");

		}else{
			System.out.print("alp1 �̱�");

		}

	}
}