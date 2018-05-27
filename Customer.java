package may27;

public class Customer {
	//class members
	
	//variables
	int id;
	String name;
	private int balance;
	//we should not keep password in a String variable
	//TODO: search best fit
	private String password;
	private int pin;

	static String bankName;
	static String branchName;
	
	
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
		bankName = "ICICI";
		branchName = "Sec 62 Noida";
		
		System.out.println("Directly");
		printBankDetails();
		System.out.println("Using Class");
		Customer.printBankDetails();
		
		
		Customer arun = new Customer();
		arun.balance = 100;
		arun.id = 21;
		arun.name = "Arun Gupta";
		
		System.out.println("Using obj");
		arun.printBankDetails();
		arun.printAccountDetails();

		System.out.println("Using anon Obj");
		(new Customer()).printBankDetails();
		(new Customer()).printAccountDetails();

		
	}
	
}
