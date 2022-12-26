import java.util.Scanner;
import java.util.Random;
public class rock_paper_siccor {
	public static void main(String[]args) {
		
		/*
		 * 0 =Rock
		 * 1 =Paper
		 * 2 =Scissor
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println(" 0 = Rock\n 1 = Paper\n 2 = scissor");
		int U_I,C_I;
		System.out.println("Lets Play, make your choice");
		do {
		C_I  = r.nextInt(3);
		U_I = sc.nextInt();
		
		if(U_I==C_I) {
			System.out.println("It's draw!");
		}
		else if (U_I==0 && C_I==2 || U_I==1 && C_I==0 || U_I==2 && C_I==2) {
			System.out.println("You Won!");	
		}
		else if (U_I==0 && C_I==1 ||U_I==1 && C_I==2 || U_I==2 && C_I==0) {
			System.out.println("Computer won!, Better luck next time");
			System.out.println("Play Again:");
		}
		else {
			System.out.println("Enter valid Choice");
		}
		
		}while(U_I==C_I || U_I==0 && C_I==1 ||U_I==1 && C_I==2 || U_I==2 && C_I==0 || U_I!=1&&U_I!=2&&U_I!=0);

		
	}
		
}
	 

		
		
		
		
		
		
		
		
