package Phase;
import java.util.Scanner;
public class Login 
{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String pass;
		String user;
		
		
		
		System.out.print("Enter username:");
		user = input.nextLine();
		
		System.out.print("Enter password:");
		pass = input.nextLine();
		
		if(user.equals("Ec utbildning") && (pass.equals("1234"))){
		System.out.println("Välkommen till EcUtbildning ");
		
		
		
		}else {
			System.out.println("Försök 2");
		
			
			
			System.out.print("Enter password:");
			pass = input.nextLine();
			
			if(user.equals("Ec utbildning") && (pass.equals("1234"))){
			System.out.println("Välkommen till EcUtbildning ");
			
			
			
			}else {
				System.out.println("Försök 3");
				
			
				
				System.out.print("Enter password:");
				pass = input.nextLine();
				
				if(user.equals("Ec utbildning") && (pass.equals("1234"))){
				System.out.println("Välkommen till EcUtbildning ");
				
				
				
				}else {
					System.out.println("Wrong.!! Get out of here you filthy animal");
		}
		
		
	}

}}}
