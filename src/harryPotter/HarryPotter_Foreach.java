package harryPotter;
import java.util.Scanner;
public class HarryPotter_Foreach 
{
//static int maxAttempts = 5; 
public static void main(String[] args)
{
System.out.println("\n\n FOR EACH LOOP");

Scanner input = new Scanner(System.in);
String movieName[]=new String[5];
for(int i=0;i<5;i++)
{
	System.out.println("Enter the movieName:"+(i+1));
	movieName[i]=input.next();
}
for(String movie:movieName)
{
	System.out.println("MovieNames:" +movie);
}

input.close();
}
}




/*for (int attemptCount = 1; attemptCount <= maxAttempts; attemptCount++)
{

System.out.println("\n Attempt # = " + attemptCount);
System.out.println("Enter the MovieName : ");
String MovieName1 = input.next();
//System.out.println("Enter the MovieName : "+ MovieName1);


//String UserenterdMovieName[] = {MovieName1}; 
//System.out.println("MovieName : "+ UserenterdMovieName );


System.out.println("Enter Movie Name: ");

Scanner sc = new Scanner(System.in);

String moviename1 = input.nextLine();
// Use this to split the input into different indexes of the array
String[] moviename = input.split(" ");

System.out.println("Enter the given words to find the index of its first match: ");
Scanner sc2 = new Scanner(System.in);
String key = sc2.next();




}
}

//
}*/

