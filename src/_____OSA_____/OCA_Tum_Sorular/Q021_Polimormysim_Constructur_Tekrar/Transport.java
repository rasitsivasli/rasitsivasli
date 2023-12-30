package _____OSA_____.OCA_Tum_Sorular.Q021_Polimormysim_Constructur_Tekrar;

class Vehicle {
	Vehicle(){
		System.out.println("Vehicle");
	}
}
class Bus extends Vehicle{
	Bus(){
		System.out.println("Bus");
	}
}
public class Transport {
	public static void main(String[] args) {

		Vehicle v = new Bus();


	}
}
//What is the result?
//A.	Vehicle 
//		Bus
//B.	Bus
//		Vehicle
//C.	Bus
//D.	The program doesn’t print anything
