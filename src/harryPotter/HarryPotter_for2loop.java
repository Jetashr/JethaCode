package harryPotter;
//import java.util.Scanner;
public class HarryPotter_for2loop {
	//Creating a single for loop to print all the data in the format [Movie Number, Movie name, Year Of Release]
	public static void main(String[] args)
	{
		
		
		int MovieNumber[]= {1,2,3,4,5,6,7,8};
		String MovieName[]= {"Harry Potter and the Philosopher's Stone",
				             "Harry Potter and the Chamber of Secrets",
				              "Harry Potter and the Prisoner of Azkaba",
				               "Harry Potter and the Goblet of Fire",
				                "Harry Potter and the Order of the Phoenix",
				                "Harry Potter and the Half-Blood Prince",
				                 "Harry Potter and the Deathly Hallows – Part 1",
				                 "Harry Potter and the Deathly Hallows – Part 2",
				                 };
		int YearofRelease[]= {2001,2002,2004,2005,2007,2008,2009,2010,2011};
		int j=MovieName.length;
		for(int i=0;i<j;i++)
		{
		    System.out.println("MovieNumber "+ MovieNumber[i] + " is " + MovieName[i] + " released in the year " + YearofRelease[i] + ".");
		  
		}
		
		
	}

}