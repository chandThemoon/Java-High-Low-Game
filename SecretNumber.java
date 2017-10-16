//Name: Chand Babu Haryani
// SecretNumber
import java.util.Random;
import java.util.Scanner;

public class SecretNumber {
    	
	public static void main(String [] args){
		int guess, rand;
		int count =1;
		Random rnd = new Random(System.currentTimeMillis()); // generating random num everytime.
		rand = 1+ rnd.nextInt(100); // generates num b/w 1 to 100.		
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter your guess: ");
		guess = input.nextInt();
		 while(guess!=rand){
			  if (guess == 0){
				  System.out.println("Number can't be 0, program terminated. ");
				  System.exit(0);
			  }
			  else if (guess >=(rand +30)){
				System.out.println("Way too high");
			  }
			  else if (guess <= (rand -30)){
				System.out.println("Way too low");
			  }
			  else if(guess >= (rand +10) && guess<=(rand+30)){
			  System.out.println("High");
			  }
			  else if (guess <= (rand - 10 )&& guess >=(rand-30)){
				 System.out.println("Low");
			  }
			  else if(guess>=(rand+1)&& guess<=(rand+10)){
				System.out.println("A little high");
			  }
			  else if(guess<=(rand-1)&& guess>=(rand-10)){
				System.out.println("A little low");
			  }
			  
			  	System.out.print("Enter your guess: ");
			  	guess = input.nextInt(); 	
			  	++count;
		 }
		 	  if (guess== rand)
		      System.out.println("Congratulations! You got it! ");
		      System.out.println("The number of tries it took you is " + count);
	}
}
