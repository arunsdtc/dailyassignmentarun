package may27;

public class ArrayDemo {
	
	public static void main(String arg[]) {
		String students[] = new String[3] ;
		
		students[0] = "Arun";
		students[1] = "Ritesh";
		students[2] = "Shubham";
		//normal for loop
		System.out.println("Students are: ");
		for(int i = 0; i < students.length; i++) {
			System.out.println("student number "+(i+1)+": "+students[i]);
		}
		//for each loop => use for collection only
		for(String student: students) {
			System.out.println(student);
		}
		System.out.println(students[2]);
	}

}
