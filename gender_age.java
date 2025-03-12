import java.util.Scanner;

public class gender_age {
	
	public static void main(String[] args) {
		 
		int age;
		String gender;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter gender: ");
        gender = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
				
        if(gender.equals("male")) {   //The equals() method checks if the content of the two strings is exactly the same.

        	if (age>=21) {
        		
        		System.out.println("Eligibe for marriage");
        	}else {
        		System.out.println("not eligible for marriage");
        	}
        }
        
        if(gender.equals("female")) {
        	if (age>=18) {
        		
        		System.out.println("Eligibe for marriage");
        	}else {
        		System.out.println("not eligible for marriage");
        	}
        }
        
        
	}

}
