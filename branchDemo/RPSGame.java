import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter R.S.P");
		String alp1 = scan.next();
		System.out.println("Enter R.S.P");
		String alp2 = scan.next();
	

		if(alp1.equals("R") && alp2.equals("R")){
			
			System.out.println("∫Ò±Ë");

		}else if(alp1.equals("R") && alp2.equals("S")){
		
			System.out.println("alp1 ¿Ã±Ë");
		
		}else if(alp1.equals("R") && alp2.equals("P")){
		
			System.out.println("alp2 ¿Ã±Ë");

		}else if(alp1.equals("S") && alp2.equals("R")){
			
			System.out.println("alp2Ω¬∏Æ");

		}else if(alp1.equals("S") && alp2.equals("S")){
		
			System.out.println("∫Ò±Ë");

		}else if(alp1.equals("S") && alp2.equals("P")){
			
			System.out.println("alp1 ¿Ã±Ë");

		}else if(alp1.equals("P") && alp2.equals("S")){
			
			System.out.println("alp2 ¿Ã±Ë");

		}else if(alp1.equals("P") && alp2.equals("P")){
			
			System.out.println("∫Ò±Ë");

		}else{
			System.out.print("alp1 ¿Ã±Ë");

		}

	}
}