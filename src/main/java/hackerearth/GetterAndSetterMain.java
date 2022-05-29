package hackerearth;

public class GetterAndSetterMain {

	public static void main(String[] args) {

		Product p1= new Product(23, "VanHeausen", 499);
		Product p2= new Product(95, "Gucci ", 999);
		
		
		System.out.println("values before setter mechanism");
		System.out.println(" p1  : "+p1);
		System.out.println(" p2  : "+p2);
		GetterAndSetter.settingValues(p1,p2);
		
		System.out.println("\n\n\n values after setter mechanism ");
		System.out.println(" p1  : "+p1);
		System.out.println(" p2  : "+p2);
	}

}
