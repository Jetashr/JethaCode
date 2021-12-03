package harryPotter;
import java.util.Scanner;
public class MovieNumber {
	// user enters input as 1, print ”First movie”,  8, print “Last movie”. 
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the movienumber : ");
        int movienumber = input.nextInt();
        input.close();

		if (movienumber==1)
		{
			System.out.println("First Movie");
			
		}
		else if(movienumber==8)
		{
			System.out.println("last Movie");
		}
			else
				System.out.println("Not first or last movie ");
		}
	}


