import java.util.Scanner;

public class vowels_consonant {
	
	public static void main(String[] args) {
		
		char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = scanner.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') ) {
        	if(ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U')
        	{
        	System.out.println(ch + " is an uppercase vowels");
           }  else {
        	System.out.println("It is uppercase consonant");
           }
        }
        
        else if ((ch >= 'a' && ch <= 'z') ) {
        	if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
        	{
        	System.out.println(ch + " is an lowercase vowels");
           }  else {
        	System.out.println("It is lowercase consonant");
           }
        }
        
		
	}
}


