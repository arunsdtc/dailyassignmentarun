package may27;

public class EqualAndHashCodeContract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int a1 = 10;
		int b1 = 10;
		
		if(a1 == b1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		Integer a2 = new Integer(10);
		Integer b2 = new Integer(10);
		
		if(a2 == b2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		*/
		String a  = "Sagar";
		String b = "Sagar";
		
		b="Arun";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		if(a == b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		String c = new String("Arun");
		String d = new String("Arun");
		
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
		if(c == d) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		c = "Sagar Pahwa";
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		if(c == d) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
