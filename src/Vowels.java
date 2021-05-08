import java.util.Scanner;

public class Vowels {
	public static boolean vowelsTest(String str, int constant, int vowel){
	    String vowelLetters = "aeiou";
	    if(vowelLetters.indexOf(str.charAt(0))>=0)
	    	vowel++;
	    else
	    	constant++;
	    if(str.length()==1)
	        return (vowel > constant);
	    return vowelsTest(str.substring(1), constant, vowel);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.print("Enter the string to be tested \n(or type x to quit)--> ");
			String toBeTested = input.nextLine();
			if("x".equals(toBeTested)) {
				System.out.println("Bye...");
				System.exit(0);
			}
			else if(vowelsTest(toBeTested, 0, 0))
				System.out.println("It has more vowels.\n");
			else 
				System.out.println("It has more constants.\n");
		}
	}
}
