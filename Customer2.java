package may27;

public class Customer2 {
	//class members
	
	//variables
	int id;
	String name;
	private int balance;
	//we should not keep password in a String variable
	//TODO: search best fit
	private String password;
	private int pin;

	static final String bankName = "ICICI";
	static final String branchName = "Noida sec 62";
	
	
	//methods
	public void printAccountDetails(){
		//The object for which a non static method is called, 
		//can be referred directly or using this keyword
		System.out.print("Account Details are:");
		System.out.print(" id: "+this.id);
		System.out.print(" name: "+this.name);
		System.out.println(" balance: "+this.balance);		
	}
	
	public static void printBankDetails(){
		System.out.print("Bank Details are: ");
		System.out.print(" bankName: "+bankName);
		System.out.println(" branchName: "+branchName);
		
	}
	
	public static void main(String arg[]) {
		
		Customer2 customersList[] = new Customer2[3];
		Customer2 obj = new Customer2();
		obj.id = 11;
		obj.balance =100;
		obj.name = "arun";
		customersList[0] = obj;
		Customer2 obj2 = new Customer2();
		obj2.id = 12;
		obj2.balance =1000;
		obj2.name = "ritesh";
		customersList[1] = obj2;
		Customer2 obj3 = new Customer2();
		obj3.id = 13;
		obj3.balance =100000;
		obj3.name = "shubham";
		customersList[2] = obj3;
		for(Customer2 customer: customersList) {
			System.out.print("Account Details are:");
			System.out.print(" id: "+customer.id);
			System.out.print(" name: "+customer.name);
			System.out.println(" balance: "+customer.balance);
			System.out.println();
		}
	}

}
