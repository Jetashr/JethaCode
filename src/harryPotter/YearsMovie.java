package harryPotter;
import java.util.Scanner;
public class YearsMovie {

	public static void main(String[] args) {
		int totalmovies=8;
		int lastmovieyr=2011;
		int firstmovieyr=2001;
		int movieyr=(lastmovieyr-firstmovieyr);
		float appmovieyr=(movieyr/totalmovies);
		int moviemonth=movieyr%totalmovies;
		System.out.println("Approx years for a movie release is :" + appmovieyr + " Years and "+ moviemonth + " months");
		//System.out.println("moviemonth is:" + moviemonth);	
		
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the movie release year : ");

		int movieyear = input.nextInt();

		input.close();

		switch (movieyear) {

		case 2001:

		System.out.println("Harry Potter and the Philosopher's Stone");

		break;

		case 2002:

		System.out.println("Harry Potter and the Chamber of Secrets");

		break;
		
		case 2004:

		System.out.println("Harry Potter and the Prisoner of Azkaban");

		break;
		
		case 2005:

		System.out.println("Harry Potter and the Goblet of Fire");

		break;
		
		case 2007:

		System.out.println("Harry Potter and the Order of the Phoenix");

		break;
		
		case 2009:

		System.out.println("Harry Potter and the Half-Blood Prince");

		break;
		
		case 2010:

		System.out.println("Harry Potter and the Deathly Hallows – Part 1");

		break;
		
		case 2011:

		System.out.println("Harry Potter and the Deathly Hallows – Part 2");

		break;
		}		
		}

}
