package Assignment1;
import java.util.Scanner;
public class EmailVerfication {

	public static void main(String[] args) {
		Boolean flag=false;
		String Emails[]=new String[4];
		Emails[0]="snehalasutkar143@email.com";
		Emails[1]="dilipasutkar1965@email.com";
		Emails[2]="shailaasutkar1972@email.com";
		Emails[3]="sumitasutkar2000@email.com";
		Scanner cc=new Scanner(System.in);
		System.out.println("Enter your Email: ");
		String userEmail=cc.next();
		for(String email:Emails) {
			if(userEmail.matches(email)) {
				System.out.println("Welcome back " +userEmail);
				flag=true;
				break;
			}
		}
		if(flag== false)
		{
		System.out.println("Invalid user");
			}
	}
}


