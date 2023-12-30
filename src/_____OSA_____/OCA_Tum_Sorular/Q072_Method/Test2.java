package _____OSA_____.OCA_Tum_Sorular.Q072_Method;

class Test2 {

    public static void main(String[] args) {
        Test2 ts = new Test2();
        System.out.print(isAvailable + "");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);

    }

    public static boolean doStuff() {
        return !isAvailable;
    }

    static boolean isAvailable = false; //once isavailble yazdiriyor sonra dostaff
}
/*
	What is the result?
	A.	Compilation fails.
	B.	false true
	C.	true false
	D.	true true
	E.	false false




	Answer: B

	 */