package _____OSA_____.OCA_Tum_Sorular.Q027_Construktur_Tekrar;

public class CheckingAccount {
	public int amount;
	// line n1
	public CheckingAccount(){

	}
}
// and given this main methot, located in another class
class another{
	public static void main(String[] args) {
		CheckingAccount acc = new CheckingAccount();


		System.out.println("acc.amount = " + acc.amount);
		// line n2
	}
}/*Which three pieces of code, when inserted independently, set the value of amount to 100?
 	A. At line n1 insert:
 		public CheckingAccount(){
 		amount = 100;					
 		}
 		
 	 B. At line n2 insert:
 		this.amount = 100;   			// ==>Cannot use this in a static  context
 		
 	 C. At line n2 insert:
 		amount = 100;					// ==> Cannot make a static reference to the non-static field amount
 		
 	 D. At line n1 insert:
 		public CheckingAccount(){
 		this.amount = 100;
 		}
 		
 	 E. At line n2 insert:
 		acc.amount = 100;
 		
 	 F. At line n1 insert:
 		public CheckingAccount(){
 		acc.amount = 100;				// ==> acc cannot be resolved to a variable
 		}
 
 */







// A D E