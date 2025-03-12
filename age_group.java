
public class age_group {
	
	public static void main(String[] args) {
		
		int person_age = 20;
		
		if(person_age<=12 && person_age>=0) {
			System.out.println("It is child");
		}
		else if(person_age<=19 && person_age>=13) {
			System.out.println("It is teenager");
		}
		else if(person_age<=59 && person_age>=20) {
			System.out.println("It is Adult");
		}
		else {
			System.out.println("It is a senior citizens");
		}
	}

}
