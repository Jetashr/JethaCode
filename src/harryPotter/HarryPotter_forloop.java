package harryPotter;
import java.util.Scanner;
public class HarryPotter_forloop {
public static void main(String[] args) {
	
	//Getting a number as input from user and print the name of the movie
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the movienumber: ");
	int movienumber = input.nextInt();
	switch (movienumber) {
	case 1:
	    System.out.println("Harry Potter and the Philosopher's Stone");
	break;
	case 2:
	    System.out.println("Harry Potter and the Chamber of Secrets");
	break;
	case 3:
	    System.out.println("Harry Potter and the Prisoner of Azkaban");
	break;
	case 4:
	    System.out.println("Harry Potter and the Goblet of Fire");
	break;
	case 5:
		System.out.println("Harry Potter and the Order of the Phoenix");
	break;
	case 6:
		System.out.println("Harry Potter and the Half-Blood Prince");
		break;
	case 7:
		System.out.println("Harry Potter and the Deathly Hallows – Part 1");
		break;
	case 8:
		System.out.println("Harry Potter and the Deathly Hallows – Part 2");
		break;
	default:
	System.out.println("Invalid Input");
	} 

input.close();
}
}
