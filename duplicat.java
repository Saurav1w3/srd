import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class duplicat {

	public static void main(String[] args) {
		String sentence, result = "";
		String allWords[];
		
		Scanner sc = new Scanner(System.in);
		// Accept any sentence from User 
		System.out.print("Enter your sentence: "); 
		sentence = sc.nextLine().toLowerCase();  //convert to lower case
		sentence =sc.nextLine().toUpperCase();
		
		// Split the given sentence to get each word as String array
		allWords = sentence.split(" ");
		allWords =sentence.split("");
		// Convert String Array allWords to LinkedHashSet to remove duplicates
        LinkedHashSet<String> set = new LinkedHashSet<String>( Arrays.asList(allWords) );
        
		// Convert to String
		for(String word: set) {
			result = result + word + " ";
		}
		// Display given String after removing duplicates
		System.out.println("Sentence after removing duplicate words: " + result);


	}

}
