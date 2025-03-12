
public class grades {
	
	public static void main(String[] args) {
		
		int marks=72;
		
		if(marks<=100 && marks>=90) {
			System.out.println("Grade A");
		}
		else if(marks<=89 && marks>=80) {
			System.out.println("Grade B");
		}
		else if(marks<=79 && marks>=70) {
			System.out.println("Grade C");
		}
		else if(marks<=69 && marks>=60) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}
	}

}
