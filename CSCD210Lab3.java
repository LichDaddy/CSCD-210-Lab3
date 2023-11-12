import java.util.Scanner;
import java.text.DecimalFormat;

public class CSCD210Lab3{
	
    public static void main(String [] args){
		
        // constant field
		final double MTF = 3.28084;          // meters to feet
		final double KPH_CONVERSION = 3.6;   // kilometers per hour conversion
		final double MPH_CONVERSION = 1.609; // miles per hour conversion 
		final double lowTime = 9.58;		 // low range for randomTime
		final double hightTime = 34.00;       // high range for randomTime
		final double YPS = 1.09361;         // yards per second conversion

		// primitive variable field 
		int minutes;			// this is for the mile 		
		double enteredTime; 	// user entered time 
		double randomTime; 		// computer random generated time 
		double mps; 			// meters per second 
		double fps; 			// feet per second 
		double kph; 			// kilometers per hour 
		double mph; 			// miles per hour
		double hundredYards;	// self explanatory
		double seconds; 		// this is for the mile 
		
		// object instantiation // 
		Scanner userInput = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		/////////////////
		// PERSON TIME // 
		/////////////////

		// cin field 
		System.out.print("Please enter the winning time of the race: ");
		enteredTime = userInput.nextDouble();	
        userInput.nextLine(); // clear input buffer 
		
		System.out.println(); // endl

		// math field 
		mps = 100 / enteredTime;
		fps = 100 * MTF / enteredTime;                  // meters to feet conversion
		kph = mps * KPH_CONVERSION;                     // meters per second to kilometers per hour conversion
		mph = kph / MPH_CONVERSION;	                    // kilometers per hour to miles per hour conversion
		hundredYards = 100 / (mps * YPS);               // meters per second times yards per second conversion to 100 yards
		minutes = (int)(60/mph);                        // minutes to run a mile
		seconds = ((60/mph) - (double)minutes) * 60;    // seconds to run a mile
		
		// cout field 
		System.out.println("The person was traveling at a rate of:");
		System.out.printf("%.2f meters per second,\n", mps);
		System.out.printf("%.2f feet per second,\n", fps);
		System.out.printf("%.2f kilometers per hour,\n", kph);
		System.out.printf("%.2f miles per hour,\n", mph);
		System.out.println(); // endl
		
		System.out.printf("It would take %d minutes and %.2f seconds for the person to run one mile.\n", minutes, seconds);
		System.out.printf("It would take %.2f seconds for the person to run 100 yards.\n", hundredYards);
		System.out.println(); // endl

		///////////////////
		// COMPUTER TIME //
		///////////////////

		// random generator 
		randomTime = ( Math.random() * ((hightTime - lowTime + 1)) ) + lowTime;
		System.out.println("The computer generated a winning time of: " + df.format(randomTime));
		System.out.println(); // endl	
		
		// math field 
		mps = 100 / randomTime;
		fps = 100 * MTF / randomTime;
		kph = mps * KPH_CONVERSION;
		mph = kph / MPH_CONVERSION;	
		hundredYards = 100 / (mps * YPS);
		minutes = (int)(60/mph); 
		seconds = ((60/mph) - (double)minutes) * 60;
		
		// cout field 
		System.out.println("The person was traveling at a rate of:");
		System.out.println(df.format(mps) + " meters per second,");
		System.out.println(df.format(fps) + " feet per second,");
		System.out.println(df.format(kph) + " kilometers per hour,");
		System.out.println(df.format(mph) + " miles per hour,");

		System.out.println(); // endl
		
		System.out.println("It would take " + minutes + " minutes and " + df.format(seconds) + " seconds for the person to run one mile.");
		System.out.println("It would take " + df.format(hundredYards) + " seconds for the person to run 100 yards.");		
		
		// destructor 
		userInput.close(); 
    } // end of main

}// end of class