package harryPotter;
import java.util.Scanner;
public class HarryPotter_floop {
public static void main(String[] args) 
{
	//getting input from user and print the name of the movie till the user enters an invalid input
	
		String[][] movieName={
				{"1","Harry Potter and the Philosopher's Stone"},
				{"2","Harry Potter and the Deathly Hallows – Part 2"},
				{"3","Harry Potter and the Chamber of Secrets"},
				{"4","Harry Potter and the Prisoner of Azkaban"},
				{"5","Harry Potter and the Goblet of Fire"},
				{"6","Harry Potter and the Order of the Phoenix"},
				{"7","Harry Potter and the Deathly Hallows – Part 1"},
				{"8","Harry Potter and the Half-Blood Prince"}				
				};

		System.out.println("Enter the movienumber: ");
		Scanner input = new Scanner(System.in);
		int movienumber = input.nextInt();
		
		int k = 0 ;
	    int j=movieName.length;
	    input.close();	    
		for (int i = 0; i < j; i++)	{
			int movienumbervalue = Integer.parseInt(movieName[i][0]);
	
			if (movienumber == movienumbervalue)
				
				{
				System.out.println("Movie name for the input number is "+ movieName[i][1] );
				k = k++ ;
				
					break;
					}
			
				}
								}
}
				