package harryPotter;

public class HarryPotter_Series {
public static void main(String[] args) {
		
	//years elapsed between first and last movie of Harry Potter
	
      String[][] movieName={
			{"1","Harry Potter and the Philosopher's Stone","2001"},
			{"2","Harry Potter and the Deathly Hallows – Part 2","2002"},
			{"3","Harry Potter and the Chamber of Secrets","2004"},
			{"4","Harry Potter and the Prisoner of Azkaban","2005"},
			{"5","Harry Potter and the Goblet of Fire","2007"},
			{"6","Harry Potter and the Order of the Phoenix","2009"},
			{"7","Harry Potter and the Deathly Hallows – Part 1","2010"},
			{"8","Harry Potter and the Half-Blood Prince","2011"}				
			};
         int j = movieName.length-1;
         int minofYears = Integer.parseInt(movieName[0][2]);
    	 int maxnofYears = Integer.parseInt(movieName[j][2]);
	     int elapsedyears = Math.abs(maxnofYears-minofYears);
	   	 System.out.println("noofElapsedYears = "+ elapsedyears);
			
}
}
	
//int k = Math.abs(j-1);
//Arrays.sort(sorted, new ArrayComparator<>());
//System.out.println(k);
//for (int i = 0; i<j ; i++)
//for (int i = 0; i<j ; i++)
// Arrays.sort(movieName[0]);
//System.out.println(movieName[0][2] +"is:"+ j);
//System.out.println(movieName[j][2] +"is:"+ j);




