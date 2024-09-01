package dynamicCoding;

public class DynamicMehtod {

	public static void main(String[] args) {
		
		DynamicMehtod dm = new DynamicMehtod();
		//static coding
		dm.fullName();
		dm.fullName();
		
		//dynamic coding with void method
		  /*
		   * in the void method 
		   * what ever logics/arugements you made that is final
		   */
		dm.dynamicFullName("aoyon", "khonkoder");
		dm.dynamicFullName("thauhidul", "Alom");
		dm.dynamicFullName("thauhidul11", "Alom111");
		
		//dynamic coding with return method
		  /*
		   * in the return type method 
		   * what ever logics/arugements you made 
		   * you can take them to another method or bloc
		   * and modify them.

		   */
		String upperCaseName=dm.returnTypefullName("faruq", "molla").toUpperCase();
		System.out.println(upperCaseName);
		String lowerCase=dm.returnTypefullName("thauhidul", "Alom").toLowerCase();
		System.out.println(lowerCase); 
		
		
	}
	
	public void fullName() {
		String firstName="Salman";
		String lastName="Shariar";
		String fullName=firstName+" "+lastName;
		System.out.println(fullName);
		
	}
	
public void dynamicFullName(String firstName, String lastName) {
	String fullName=firstName+" "+lastName;
	System.out.println(fullName);
	}

public String returnTypefullName(String firstName, String lastName) {
	String fullName=firstName+" "+lastName;
	System.out.println(fullName);
	return fullName;
	
	
}

}
