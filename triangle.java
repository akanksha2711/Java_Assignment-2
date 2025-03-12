
public class triangle {
	public static void main(String[] args) {
		
		int side = 3;
		int side1 = 5;
		int side2= 4;
		
		if(side== side1 && side1==side2 && side==side2) {
			System.out.println("It is equilateral triangle");
		}
		else if(side== side1 || side1==side2 || side==side2) {
		  System.out.println("It a isosceles triangle");
		}
		else {
			System.out.println("it is a scalen triangle");
		}
 
	}

}
