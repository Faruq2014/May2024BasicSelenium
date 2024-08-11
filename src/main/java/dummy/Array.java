package dummy;

public class Array {

	public static void main(String[] args) {
		Array array = new Array();
		array.countStudents();
	}
	
	
	public void countStudents() {
		//String studentsOne="Oyon";
		//String studentsTwo="Tahoura";
		//String studentsThree="Salman";
		//array
		String [] students= {"Oyon","Tahoura","Salman","Shakil","Jamil"};
		System.out.println(students);
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println();
		for (int i = 0; i < students.length; i++) {
			if (students[i].equalsIgnoreCase("Salman")) {
				break;
			}
			System.out.println(students[i]);
		}
	}

}
